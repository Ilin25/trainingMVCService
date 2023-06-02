package ru.services;

import ru.generatedSources.PersInfoBetweenDateOfBirthRequest;
import ru.generatedSources.PersInfoBetweenDateOfBirthResponse;

/**Интерфейс сервиса по обработке персональной информации */
public interface HolderService {

    PersInfoBetweenDateOfBirthResponse handlePersInfoBetweenDateRequest(PersInfoBetweenDateOfBirthRequest request);

}
