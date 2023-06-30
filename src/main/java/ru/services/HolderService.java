package ru.services;

import ru.entity.CardHolder;
import ru.generatedSources.PersInfoBetweenDateOfBirthRequest;
import ru.generatedSources.PersInfoBetweenDateOfBirthResponse;

import java.time.LocalDate;
import java.util.List;

/**Интерфейс сервиса по обработке персональной информации */
public interface HolderService {


    PersInfoBetweenDateOfBirthResponse handlePersInfoBetweenDateRequest(PersInfoBetweenDateOfBirthRequest request);
    List<CardHolder> findHoldersBetweenDateOfBirth(LocalDate from,LocalDate to);
}
