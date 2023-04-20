package main.java.fabrics;


import main.java.entity.Card;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardFabric {

    public Card makeRandomCard(boolean isActive) {

        return new Card(makeRandomNumber(), makeRandomDate(), isActive);
    }

    private String makeRandomNumber(){
        int randomNumber1 = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
        int randomNumber2 = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
        int randomNumber3 = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
        return "" + randomNumber1 + randomNumber2 + randomNumber3;
    }

    private LocalDate makeRandomDate(){
        Random random = new Random();
        int minDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2023, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        return randomDate;
    }


    public List<Card> makeRandomCards (int activeCardCounter,int notActiveCardCounter) {
        List<Card> randomCards = new ArrayList<>();
        randomCards.addAll(makeActiveCard(activeCardCounter));
        randomCards.addAll(makeNotActiveCard(notActiveCardCounter));
        return randomCards;
    }

    private List<Card> makeActiveCard(int activeCardCounter) {
        List<Card> activeCards = new ArrayList<>(activeCardCounter);
        for (int i = 0; i < activeCardCounter; i++) {
            activeCards.add(makeRandomCard(true));
        }
        return activeCards;
    }

    private List<Card> makeNotActiveCard(int notActiveCardCounter) {
        List<Card>  notActiveCards = new ArrayList<>(notActiveCardCounter);
        for (int i = 0; i < notActiveCardCounter; i++) {
            notActiveCards.add(makeRandomCard(false));
        }
        return notActiveCards;
    }
}