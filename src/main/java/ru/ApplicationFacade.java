package ru;

import ru.Util;
import ru.entity.CardHolder;
import ru.fabrics.CardHolderFabric;

import java.io.IOException;
import java.util.List;

public class ApplicationFacade {

    public static void main(String[] args) throws IOException {
        CardHolderFabric holderFabric = new CardHolderFabric();
        List<CardHolder> cardHolders = holderFabric.makeRandomHolders(20,20);
        Util.viewHolders(cardHolders);
        //System.out.println(cardHolders);



        /**Здесь будет создание сущностей и запуск приложения*/

    }

}
