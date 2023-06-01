package ru.services;

import ru.dao.CardHolderDao;
import ru.dao.CardHolderDaoImpl;
import ru.dao.PersInfoDao;
import ru.dao.PersInfoDaoImpl;
import ru.entity.CardHolder;
import ru.entity.PersInfo;
import ru.generatedSources.PersInfoBetweenDateOfBirthRequest;
import ru.generatedSources.PersInfoBetweenDateOfBirthResponse;
import ru.generatedSources.PersInfoResponse;
import ru.generatedSources.PersonalInfo;

import java.util.ArrayList;
import java.util.List;

public class PersInfoServiceImpl implements PersInfoService {

    private CardHolderDao cardHolderDao = new CardHolderDaoImpl();


    @Override
    public PersInfoBetweenDateOfBirthResponse handlePersInfoBetweenDateRequest(PersInfoBetweenDateOfBirthRequest request) {
        List<CardHolder> holders = cardHolderDao.findHolderBetweenDateOfBirth(request.getDateOfBirthFrom(),request.getDateOfBirthTo());
        List<PersInfoResponse> responses = new ArrayList<>();
        for (CardHolder holder : holders) {
            PersInfoResponse persInfoResponse = new PersInfoResponse();
            PersonalInfo personalInfo = new PersonalInfo();
            String lastName = holder.getPersInfo().getLastName();
            personalInfo.setLastName(lastName);
            personalInfo.setFirstName(holder.getPersInfo().getFirstName());
            personalInfo.setMiddleName(holder.getPersInfo().getMiddleName());
            persInfoResponse.setPersonalInfo(personalInfo);
            responses.add(persInfoResponse);
        }
        PersInfoBetweenDateOfBirthResponse response = new PersInfoBetweenDateOfBirthResponse();
        response.setResponses(responses);

        return response;
    }
}
