package main.java.enums;

public enum ErrorsEnum {

    I000("Успешная обработка"),
    E001("Не заполнено поле СНИЛС"),
    E002("Не заполнено поле Дата рождения"),
    E003("Поле снилс не соответствует паттерну"),
    E004("Пользователю менее 18 лет");

    private String errorDescription;

    ErrorsEnum(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
