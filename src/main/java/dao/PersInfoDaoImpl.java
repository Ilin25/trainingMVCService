package main.java.dao;

import main.java.entity.CardHolder;

import java.time.LocalDate;
import java.util.List;

/** Слой работы с БД. Реализация
 * При наличии БД здесь распологлись бы методы работы с БД,
 * использующие sql , JPA , criteria и т.д.
 * В нашем случае мы будем генерировать сущности сами,как будто они взяты из БД.
 *
 *
 * */
public class PersInfoDaoImpl implements PersInfoDao {

    // TODO Написать реализацию в методе.
    // Генерировать 100000 Холдеров и возвращать из них список тех,
    // кто подходит под переданные в параметрах критерии.

    @Override
    public List<CardHolder> findHolderBetweenDateOfBirth(LocalDate from, LocalDate to) {
        return null;
    }

    //TODO  Так же добавить и реализовать метод List<CardHolder> findAll();
    // Который генерирует 100000 Холдеров.

}
