package ru.controller;

import ru.dto.ValidateResults;
import ru.generatedSources.PersInfoBetweenDateOfBirthRequest;
import ru.generatedSources.PersInfoBetweenDateOfBirthResponse;
import ru.services.HolderService;
import ru.services.HolderServiceImpl;
import ru.validators.RequestValidator;
import ru.validators.Validator;

/**
 * Иммитация REST контроллера, который принимает запрос PersInfoBetweenDateOfBirthRequest
 * и отдаёт ответ PersInfoBetweenDateOfBirthResponse.
 * Работа веб приложения начинается именно отсюда.
 * Когда на контроллер приходит входящий запрос.
 * Далее происходит его обработка согласно регламента взаимодействия.
 */

 //@RestController
public class PersInfoController {

    //private Validator validator = new RequestValidator();
    private HolderServiceImpl holderServiceImpl = new HolderServiceImpl();

    /**
     * Этот метод контроллера принимает входящий запрос и реализует его обработку
     * В реальности его должен дёргать сторонний сервис
     */

 //@GetMapping("/getPersInfoBeetweenDate")
    public PersInfoBetweenDateOfBirthResponse getPersInfo(PersInfoBetweenDateOfBirthRequest request) {
        PersInfoBetweenDateOfBirthResponse response = holderServiceImpl.handlePersInfoBetweenDateRequest(request);
        return response;
    }

}
