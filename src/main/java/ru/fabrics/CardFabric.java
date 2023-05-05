package ru.fabrics;

import ru.entity.Card;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardFabric {
    BankFabric bankFabric = new BankFabric();
    public Card makeRandomCard() throws IOException {
        Card card = new Card();
        card.setNumber(makeRandomNumber());
        card.setIssueDate(makeRandomDate());
        card.setBank(bankFabric.makeRandomBank());
        card.setValDate(card.getIssueDate().plusYears(5));
        Period period = Period.between(card.getIssueDate(), LocalDate.now());
        if(period.getYears()<5){
            card.setIsActive(true);
        }

        return card;
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


    public List<Card> makeRandomCards (int cardCounter) throws IOException {
        List<Card> randomCards = new ArrayList<>();
        for (int i = 0; i < cardCounter; i++) {
            randomCards.add(makeRandomCard());
        }
        return randomCards;
    }

}