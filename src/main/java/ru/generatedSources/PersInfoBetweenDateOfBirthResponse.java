package ru.generatedSources;

import ru.enums.ErrorsEnum;
import java.util.List;

/**
 * В реальности эти классы будут генерироваться сторонней библиотекой */
/** Иммитация ответа стороннему сервису **/

public class PersInfoBetweenDateOfBirthResponse {

    private Boolean isProcessed;
    private List<PersInfoResponse> responses;
    private List<ErrorsEnum> errorsEnums;

    public Boolean getProcessed() {
        return isProcessed;
    }

    public void setProcessed(Boolean processed) {
        isProcessed = processed;
    }

    public List<PersInfoResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<PersInfoResponse> responses) {
        this.responses = responses;
    }

    public List<ErrorsEnum> getErrorsEnums() {
        return errorsEnums;
    }

    public void setErrorsEnums(List<ErrorsEnum> errorsEnums) {
        this.errorsEnums = errorsEnums;
    }
}
