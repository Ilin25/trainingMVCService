package ru;

import ru.Util;
import ru.dao.PersInfoDaoImpl;
import ru.entity.CardHolder;
import ru.fabrics.CardHolderFabric;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class ApplicationFacade {

    public static void main(String[] args) throws IOException {

        PersInfoDaoImpl persInfoDao = new PersInfoDaoImpl();
        LocalDate dateFrom = LocalDate.of(1900,10,10);
        LocalDate dateTo = LocalDate.of(2020,10,10);

        List<CardHolder> cardHolders = persInfoDao.findHolderBetweenDateOfBirth(dateFrom,dateTo);
        Util.viewHolders(cardHolders);
        System.out.println();

        /**Здесь будет создание сущностей и запуск приложения*/

    }

}
