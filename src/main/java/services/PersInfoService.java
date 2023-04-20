package main.java.services;

import main.java.generatedSources.PersInfoBetweenDateOfBirthRequest;
import main.java.generatedSources.PersInfoBetweenDateOfBirthResponse;

/**Интерфейс сервиса по обработке персональной информации */
public interface PersInfoService {

    PersInfoBetweenDateOfBirthResponse handlePersInfoBetweenDateRequest(PersInfoBetweenDateOfBirthRequest request);

}
