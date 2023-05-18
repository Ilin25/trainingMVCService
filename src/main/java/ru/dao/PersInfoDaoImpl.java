package ru.dao;

import ru.entity.CardHolder;
import ru.fabrics.CardHolderFabric;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Слой работы с БД. Реализация
 * При наличии БД здесь распологлись бы методы работы с БД,
 * использующие sql , JPA , criteria и т.д.
 * В нашем случае мы будем генерировать сущности сами,как будто они взяты из БД.
 *
 *
 * */
public class PersInfoDaoImpl implements PersInfoDao {


    static{

    }
    // TODO Написать реализацию в методе.
    // Генерировать 100000 Холдеров и возвращать из них список тех,
    // кто подходит под переданные в параметрах критерии.

    @Override
    public List<CardHolder> findHolderBetweenDateOfBirth(LocalDate from, LocalDate to) {
        List<CardHolder> holderBetweenDateOfBirth = new ArrayList<>();
        try {
            List<CardHolder> cardHolders = findAll();
            for (CardHolder holder : cardHolders){
                if (holder.getPersInfo().getDateOfBirth().isAfter(from) && holder.getPersInfo().getDateOfBirth().isBefore(to) ){
                    holderBetweenDateOfBirth.add(holder);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return holderBetweenDateOfBirth;
    }

//    public List<CardHolder> findHolderBetweenDateOfBirthUseStream(LocalDate from, LocalDate to) {
//        List<CardHolder> holderBetweenDateOfBirth = new ArrayList<>();
//        try {
//            List<CardHolder> cardHolders = findAll();
//            holderBetweenDateOfBirth = cardHolders.stream()
//                    .filter(e->e.getPersInfo().getDateOfBirth().isAfter(from) && e.getPersInfo().getDateOfBirth().isBefore(to))
//                    .collect(Collectors.toList());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return holderBetweenDateOfBirth;
//    }


    private List<CardHolder> findAll() throws IOException {
        CardHolderFabric holderFabric = new CardHolderFabric();
        List<CardHolder> cardHolders = holderFabric.makeRandomHolders(50000,50000);
        return cardHolders;
    }
}
