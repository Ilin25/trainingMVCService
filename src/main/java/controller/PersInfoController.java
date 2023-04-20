package main.java.controller;

import main.java.generatedSources.PersInfoBetweenDateOfBirthRequest;
import main.java.generatedSources.PersInfoBetweenDateOfBirthResponse;
import main.java.services.PersInfoService;
import main.java.validators.Validator;

/**
 * Иммитация REST контроллера, который принимает запрос PersInfoBetweenDateOfBirthRequest
 * и отдаёт ответ PersInfoBetweenDateOfBirthResponse.
 * Работа веб приложения начинается именно отсюда.
 * Когда на контроллер приходит входящий запрос.
 * Далее происходит его обработка согласно регламента взаимодействия.
 *
 * */


public class PersInfoController {

    private Validator validator;
    private PersInfoService persInfoService;

    /**
     * Этот метод контроллера принимает входящий запрос и реализует его обработку
     * В реальности его должен дёргать сторонний сервис
     * */

    public PersInfoBetweenDateOfBirthResponse getPersInfo(PersInfoBetweenDateOfBirthRequest request){

        return null;
    }
}
