package ru.services;

import ru.dao.CardHolderDao;
import ru.dao.CardHolderDaoImpl;
import ru.entity.Card;
import ru.entity.CardHolder;
import ru.entity.PersInfo;
import ru.generatedSources.*;

import java.util.ArrayList;
import java.util.List;

public class HolderServiceImpl implements HolderService {

    private CardHolderDao cardHolderDao = new CardHolderDaoImpl();

    @Override
    public PersInfoBetweenDateOfBirthResponse handlePersInfoBetweenDateRequest(PersInfoBetweenDateOfBirthRequest request) {
        List<CardHolder> holders = cardHolderDao.findHolderBetweenDateOfBirth(request.getDateOfBirthFrom(),request.getDateOfBirthTo());
        List<PersInfoResponse> responses = new ArrayList<>();
        for (CardHolder holder : holders) {
            PersInfoResponse persInfoResponse = new PersInfoResponse();
            PersonalInfo personalInfo = new PersonalInfo();
            DocInfo docInfo = new DocInfo();
            List<Card> cards = holder.getCards();
            List<CardInfo> cardInfos = new ArrayList<>();
            for (Card card:cards){
                CardInfo cardInfo = new CardInfo(card.getNumber(),card.getBank().getBik(),card.getBank().getName());
                cardInfos.add(cardInfo);
            }
            docInfo.setDocSeries(holder.getPersDocument().getSeries());
            docInfo.setDocNumber(holder.getPersDocument().getNumber());
            personalInfo.setLastName(holder.getPersInfo().getLastName());
            personalInfo.setFirstName(holder.getPersInfo().getFirstName());
            personalInfo.setMiddleName(holder.getPersInfo().getMiddleName());
            persInfoResponse.setPersonalInfo(personalInfo);
            persInfoResponse.setDocInfo(docInfo);
            persInfoResponse.setCardInfos(cardInfos);
            responses.add(persInfoResponse);
        }
        PersInfoBetweenDateOfBirthResponse response = new PersInfoBetweenDateOfBirthResponse();
        response.setResponses(responses);
        return response;
    }
}
