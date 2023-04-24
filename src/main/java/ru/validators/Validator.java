package ru.validators;

/**Интерфейс валидатора запроса персональной информации */
public interface Validator <R,V> {

    V validate(R request);
}
