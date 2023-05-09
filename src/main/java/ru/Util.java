package ru;

import ru.entity.Card;
import ru.entity.CardHolder;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Util {

    public static void viewHolders(List<CardHolder> holders) {
        for (int i = 0; i < holders.size(); i++) {
            CardHolder currentHolder = holders.get(i);
            System.out.println(currentHolder.getPersInfo().toString());
            System.out.println(currentHolder.getPersDocument().toString());
            System.out.println(currentHolder.getAddresses().toString());
            if (currentHolder.getPersDocument()!= null) {
                List<Card> holderCards = currentHolder.getCards();
                if (!holderCards.isEmpty()) {
                    viewCards(holderCards);
                }
            }
        }
    }

    public static void viewCards(List<Card> cards) {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(i + 1 + ")" + cards.get(i).toString());
        }
        System.out.println();
    }


    public static void viewMapCardNumToHolder(Map<String, CardHolder> cardNumToHolder) {
        int serialNumber = 1;
        for (Map.Entry<String, CardHolder> entry : cardNumToHolder.entrySet()) {
            LocalDate lastIssueDateCard = entry.getValue().getCards()
                    .stream()
                    .filter(card->card.getNumber().equals(entry.getKey()))
                    .findAny()
                    .get()
                    .getIssueDate();
            makeStringResultAndView(serialNumber,entry,lastIssueDateCard);
            serialNumber++;
        }
    }

    private static void makeStringResultAndView(int counter, Map.Entry<String, CardHolder> entry, LocalDate localDate) {
        String lastIssueNumberCardToHolder=String.format
                ("%s. %nИмя : %s%nОтество : %s%nДата рождения : %s%nГород рождения : %s%nНомер карты : %s%nДата выдачи карты : %s%nУлица :%s%n"
                ,counter,entry.getValue().getPersInfo().getFirstName(),entry.getValue().getPersInfo().getLastName(),
                entry.getValue().getPersInfo().getDateOfBirth(),
                entry.getValue().getAddresses().getCity(),
                entry.getKey(),localDate,entry.getValue().getAddresses().getStreet());
        System.out.println(lastIssueNumberCardToHolder);
    }
}

