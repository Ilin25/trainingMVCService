package ru.enums;

public enum ErrorsEnum {

    I000("Успешная обработка"),
    E001("Не корректный запрос"),
    E002("Не корректная дата начала выборки"),
    E004("Не корректная дата окончания выборки");

    private String errorDescription;

    ErrorsEnum(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
