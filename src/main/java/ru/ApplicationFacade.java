package main.ru;

import ru.Util;
import ru.dao.PersInfoDaoImpl;
import ru.entity.CardHolder;
import ru.fabrics.CardHolderFabric;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class ApplicationFacade {

    public static void main(String[] args) throws IOException {
        CardHolderFabric holderFabric = new CardHolderFabric();
        PersInfoDaoImpl persInfoDao = new PersInfoDaoImpl();
        LocalDate dateFrom = LocalDate.of(1980,10,10);
        LocalDate dateTo = LocalDate.of(1985,10,10);
//        List<CardHolder> cardHolders = holderFabric.makeRandomHolders(20,20);
//        Util.viewHolders(cardHolders);
        System.out.println(persInfoDao.findHolderBetweenDateOfBirth(dateFrom,dateTo));



        /**Здесь будет создание сущностей и запуск приложения*/

    }

}
