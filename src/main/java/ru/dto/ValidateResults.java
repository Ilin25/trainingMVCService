package ru.dto;

import ru.enums.ErrorsEnum;

import java.util.ArrayList;
import java.util.List;

public class ValidateResults {

    private boolean isValid;
    private List<ErrorsEnum> errorsEnums = new ArrayList<>();

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public List<ErrorsEnum> getErrorsEnums() {
        return errorsEnums;
    }

    public void setErrorsEnums(List<ErrorsEnum> errorsEnums) {
        this.errorsEnums = errorsEnums;
    }
}
