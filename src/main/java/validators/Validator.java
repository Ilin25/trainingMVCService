package main.java.validators;

/**Интерфейс валидатора запроса персональной информации */
public interface Validator <R,V> {

    V validate(R request);
}
