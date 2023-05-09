package ru.fabrics;

import ru.entity.PersDocument;
import ru.entity.PersInfo;

import java.time.LocalDate;
import java.util.Random;

public class PersDocumentFabric {
    public PersDocument makeRandomPersDocument(LocalDate dateOfBirth) {
        PersDocument persDocument = new PersDocument();
        persDocument.setSeries(makeRandomSeriesPersDocument());
        persDocument.setNumber(makeRandomNumberPersDocument());
        persDocument.setIssueDate(makeIssueDatePersDocument(dateOfBirth));
        persDocument.setValDate(makeValDate(persDocument.getIssueDate()));
        return persDocument;
    }

    //TODO Убрать пробел в серии
    private String makeRandomSeriesPersDocument() {
        int randomNumber = (int) (Math.random() * ((99 - 10) + 1)) + 10;
        int randomNumberTwo = (int) (Math.random() * ((99 - 10) + 1)) + 10;
        return "" + randomNumber + " " + randomNumberTwo;
    }

    private String makeRandomNumberPersDocument() {
        int randomNumber = (int) (Math.random() * ((999999 - 100000) + 1)) + 100000;
        return "" + randomNumber;
    }
    private LocalDate makeIssueDatePersDocument(LocalDate dateOfBirth){

        return dateOfBirth.plusYears(18);

    }
    private LocalDate makeValDate(LocalDate issueDatePersDocument){
        return issueDatePersDocument.plusYears(25);
    }
}
