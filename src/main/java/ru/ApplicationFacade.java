package ru;

import ru.Util;
import ru.dao.CardHolderDao;
import ru.dao.CardHolderDaoImpl;
import ru.dao.PersInfoDaoImpl;
import ru.entity.CardHolder;
import ru.fabrics.CardHolderFabric;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class ApplicationFacade {

    public static void main(String[] args) throws IOException {

        CardHolderDao cardHolderDao = new CardHolderDaoImpl();
        LocalDate dateFrom = LocalDate.of(1999,10,10);
        LocalDate dateTo = LocalDate.of(2020,10,10);

        System.out.println(  cardHolderDao.findHolderBetweenDateOfBirth(dateFrom,dateTo));


        /**Здесь будет создание сущностей и запуск приложения*/

    }

}
