package main.java.dao;

import main.java.entity.CardHolder;

import java.time.LocalDate;
import java.util.List;
/**
 * Слой работы с БД.
 * Интерфейс для описания методов ДАО
 * */
public interface PersInfoDao {

    List<CardHolder> findHolderBetweenDateOfBirth(LocalDate from, LocalDate to);


}
