package ru.dto;

import ru.enums.ErrorsEnum;

import java.util.ArrayList;
import java.util.List;

public class ValidateResults {


    private List<ErrorsEnum> errorsEnums = new ArrayList<>();

    public boolean isValid() {
        // TODO Реализовать логику. Если errorsEnums содержит только I000("Успешная обработка") - true
        //  Если содержит любые другие ошибки или пустой - false
        return false;
    }

    public List<ErrorsEnum> getErrorsEnums() {
        return this.errorsEnums;
    }

    public void setErrorsEnums(List<ErrorsEnum> errorsEnums) {
        this.errorsEnums = errorsEnums;
    }

    public Boolean addErrors(ErrorsEnum errorsEnum){
        return this.errorsEnums.add(errorsEnum);
    }
}
