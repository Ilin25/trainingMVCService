package main.java;

import main.java.entity.CardHolder;
import main.java.fabrics.CardHolderFabric;
import validators.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationFacade {

    public static void main(String[] args) throws IOException {
        CardHolderFabric holderFabric = new CardHolderFabric();
        List<CardHolder> cardHolders = holderFabric.makeRandomHolders(20,20);
        Util.viewHolders(cardHolders);



        /**Здесь будет создание сущностей и запуск приложения*/

    }

}
