package ru.dao;

import ru.entity.CardHolder;

import java.time.LocalDate;
import java.util.List;

public interface CardHolderDao {
    List<CardHolder> findHolderBetweenDateOfBirth(LocalDate from, LocalDate to);
}
