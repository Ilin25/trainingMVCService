package ru.controller;

import ru.PersInfoBetweenDateOfBirthResponseCollector;
import ru.ResponseCollector;
import ru.dto.ValidateResults;
import ru.entity.CardHolder;
import ru.generatedSources.PersInfoBetweenDateOfBirthRequest;
import ru.generatedSources.PersInfoBetweenDateOfBirthResponse;
import ru.services.HolderService;
import ru.services.HolderServiceImpl;
import ru.validators.RequestValidator;
import ru.validators.Validator;

import java.util.List;

/**
 * Иммитация REST контроллера, который принимает запрос PersInfoBetweenDateOfBirthRequest
 * и отдаёт ответ PersInfoBetweenDateOfBirthResponse.
 * Работа веб приложения начинается именно отсюда.
 * Когда на контроллер приходит входящий запрос.
 * Далее происходит его обработка согласно регламента взаимодействия.
 */

 //@RestController
public class PersInfoController {

    private final Validator<PersInfoBetweenDateOfBirthRequest,ValidateResults> validator = new RequestValidator();
    private final HolderService holderService = new HolderServiceImpl();
    private final ResponseCollector<PersInfoBetweenDateOfBirthResponse,List<CardHolder>> responseCollector = new PersInfoBetweenDateOfBirthResponseCollector();

    /**
     * Этот метод контроллера принимает входящий запрос и реализует его обработку
     * В реальности на него будет приходить запрос от стороннего сервиса
     */
    // @GetMapping("/getPersInfoBeetweenDate")
    public PersInfoBetweenDateOfBirthResponse getPersInfo(PersInfoBetweenDateOfBirthRequest request) {
        ValidateResults validateResults = validator.validate(request);
        if(validateResults.isValid()){
            List<CardHolder> holders = holderService.findHoldersBetweenDateOfBirth(request.getDateOfBirthFrom(),request.getDateOfBirthTo());
            return responseCollector.makeResponse(holders);
        } else return null;

    }
}
