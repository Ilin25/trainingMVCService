package ru.fabrics;

import ru.Constants;
import ru.entity.Card;
import ru.entity.CardHolder;
import ru.entity.Gender;
import ru.entity.PersInfo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class CardHolderFabric {

    private final CardFabric cardFabric = new CardFabric();
    private final AddressFabric addressFabric = new AddressFabric();
    private final PersDocumentFabric persDocumentFabric = new PersDocumentFabric();
    private final PersInfoFabric persInfoFabric = new PersInfoFabric();


// TODO Все холдеры должны быть старше 18 лет. Младше-не генерировать
    public CardHolder makeRandomHolder(Gender gender) throws IOException {
        CardHolder holder = new CardHolder();
        holder.setPersInfo(persInfoFabric.makeRandomPersInfo(gender));
        holder.setAddresses(addressFabric.makeRandomAddress());
        Period period = Period.between(holder.getPersInfo().getDateOfBirth(), LocalDate.now());
        if (period.getYears()>=18) {
            holder.setPersDocument(persDocumentFabric.makeRandomPersDocument(holder.getPersInfo().getDateOfBirth()));
            holder.setCards(generateRandomAmountActiveAndNotActiveCards());
        }
        return holder;
    }

    public List<CardHolder> makeRandomHolders(int manCounter, int girlCounter) throws IOException {
        int counter = manCounter + girlCounter;
        List<CardHolder> randomHolders = new ArrayList<>(counter);
        randomHolders.addAll(makeRandomManHolders(manCounter));
        randomHolders.addAll(makeRandomGirlHolders(girlCounter));
        return randomHolders;
    }

    private List<CardHolder> makeRandomManHolders(int manCounter) throws IOException {
        List<CardHolder> manRandomHolders = new ArrayList<>(manCounter);
        for (int i = 0; i < manCounter; i++) {
            manRandomHolders.add(makeRandomHolder(Gender.M));

        }
        return manRandomHolders;
    }

    private List<CardHolder> makeRandomGirlHolders(int girlCounter) throws IOException {
        List<CardHolder> girlRandomHolders = new ArrayList<>(girlCounter);
        for (int i = 0; i < girlCounter; i++) {
            girlRandomHolders.add(makeRandomHolder(Gender.F));
        }
        return girlRandomHolders;
    }

    private List<Card> generateRandomAmountActiveAndNotActiveCards() throws IOException {
        int maxCard = 10;
        int minCard = 0;
        int cardCounter = (int) ((Math.random() * (maxCard-minCard)) + minCard);
        return cardFabric.makeRandomCards(cardCounter);
    }

}