# trainingMVCService
Учебный сервис с MVC архитектурой

Искать пометки в коде по TODO
Постановки задач будут каждая в новой ветке.
task_1 --> реализацию задания выполнять в новой ветке с названием task_1_dev_rik.
Коммит с выполнением задачи называть task_1_realization.

Задача 1 . 
1.Сделать генераторы следующих сущностей.

Использовать генераторы которые уже делали,что то придётся прикрутить,что-то изменить,где-то поменять логику генерации.
Максимально отвязать генераторы друг от друга.Где это возможно.
То есть Отдельно генератор банка.Генератор карты. Персинфо.
Те поля которые сразу невозможно сгенерировать,а необходимо высчитывать по факту, догенерировать в генераторе холдера.
public class CardHolder {
    private PersInfo persInfo;
    private PersDocument persDocument;
    private Address address;
    private List<Card> cards;
    
public class PersInfo 
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;
    private Enum<Gender> gender;
    
public class Address
     private String city;
     private String street;
     private String house;

public class PersDocument 
     private String series;
     private String number;
     private LocalDate issueDate; // Дата выдачи - 18 лет (Отсчитывать от даты рождения)
     private LocalDate valDate; // + 25 лет от даты выдачи

public class Card 
    private Bank bank;
    private String number; // 12 цифр
    private LocalDate issueDate; // Не позже 18 лет холдеру
    private LocalDate valDate; + 5 лет
    private boolean isActive;
    
private class Bank
    private String bik; //9 цифр (возможные значения - 111111111,222222222,333333333,444444444 и т.д до 999999999)
    private String name; // Сбер Банк, ВТБ и т.д
 
2. Вставить генерацию холдеров в PersInfoDaoImpl, 
написать реализацию метода findHolderBetweenDateOfBirth и добавить метод List<CardHolder> findAll() по метке TODO.


    