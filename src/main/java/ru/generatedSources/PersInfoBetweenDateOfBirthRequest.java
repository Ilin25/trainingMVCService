package ru.generatedSources;

import ru.enums.ErrorsEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
/**В реальности эти классы будут генерироваться сторонней библиотекой */
/** Иммитация входящего запроса от стороннего сервиса */

public class PersInfoBetweenDateOfBirthRequest {

    private LocalDateTime sendDate;
    private LocalDate dateOfBirthFrom;
    private LocalDate dateOfBirthTo;

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public LocalDate getDateOfBirthFrom() {
        return dateOfBirthFrom;
    }

    public void setDateOfBirthFrom(LocalDate dateOfBirthFrom) {
        this.dateOfBirthFrom = dateOfBirthFrom;
    }

    public LocalDate getDateOfBirthTo() {
        return dateOfBirthTo;
    }

    public void setDateOfBirthTo(LocalDate dateOfBirthTo) {
        this.dateOfBirthTo = dateOfBirthTo;
    }
}
