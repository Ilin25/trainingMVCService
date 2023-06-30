package ru.validators;

import ru.dto.ValidateResults;
import ru.generatedSources.PersInfoBetweenDateOfBirthRequest;

public class RequestValidator implements Validator<PersInfoBetweenDateOfBirthRequest, ValidateResults> {


    @Override
    public ValidateResults validate(PersInfoBetweenDateOfBirthRequest request) {
        // TODO Реализовать валидацию входящего запроса на предмет:
        //  сам запрос != нулл
        //  LocalDateTime sendDate != нулл
        //  LocalDate dateOfBirthFrom != нулл
        //  LocalDate dateOfBirthTo != нулл
        //
        return null;
    }
}
