# trainingMVCService
Учебный сервис с MVC архитектурой

Искать пометки в коде по TODO
Постановки задач будут в ветке dev
коммит с постановкой будет называться Add task_номер задачи
реализацию задания выполнять в НОВОЙ ВЕТКЕ от коммита с постановкой dev с названием новой ветки task_Номер задачи_dev_rik.
Коммит с выполнением задачи называть task_номер задачи_realization.

Задача 1 . 
1.Сделать генераторы следующих сущностей.

Использовать генераторы которые уже делали,что то придётся прикрутить,что-то изменить,где-то поменять логику генерации.
Максимально отвязать генераторы друг от друга.Где это возможно.
То есть Отдельно генератор банка.Генератор карты. Генератор Персинфо.
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
    private LocalDate dateOfBirth; // Не младше 18 лет
    private Enum<Gender> gender;
    
public class Address
     private String city;
     private String street;
     private String house;

public class PersDocument 
     private String series; Пример // 4020 
     private String number; Пример // 456786
     private LocalDate issueDate; // Дата выдачи - 18 лет (Отсчитывать от даты рождения)
     private LocalDate valDate; // Срок действия + 25 лет от даты выдачи

public class Card 
    private Bank bank;
    private String number; // 12 цифр
    private LocalDate issueDate; // Не  менее 18 лет холдеру этой карты.
    private LocalDate valDate; Срок действия + 5 лет
    private boolean isActive;
    
public class Bank
    private String bik; // 9 цифр (возможные значения - 111111111,222222222,333333333,444444444 и т.д до 999999999)
    private String name; // Сбер Банк, ВТБ и т.д
 
2. Вставить генерацию холдеров в PersInfoDaoImpl, 
написать реализацию метода findHolderBetweenDateOfBirth и добавить метод List<CardHolder> findAll() по метке TODO.

3.Убрать age из PersInfo

4.Добавить интерфейс (имитацию слоя работы с БД по части Холдеров) CardHolderDao. 
Создать класс реализацию. Перенести в этот класс методы из PersInfoDaoImpl.

5.Добавить класс реализацию PersInfoService. Написать реализацию метода handlePersInfoBetweenDateRequest.


Общая инфа.
Цепочка вызовов в структуре MVC приложения.
Контроллер - получает входящий PersInfoBetweenDateOfBirthRequest  - обращается через ссылку к нужному сервису, сервис обращается к дао. 
Дао содержит в себе методы для обращения в БД. 
Именования слоя ДАО как правило совпадает с именем сущности в БД за которой этот слой ходит.
Например ХолдерДАО идёт в БД и достает оттуда сущность Холдера и связанные с ним сущности при необходимости.
Сервис имеет ссылки на нужные ему ДАО через которые получает данные и перерабатывает их в своих методах в нужную сущность.
В нашем случае из списка холдеров, которые предоставит ДАО в PersInfoBetweenDateOfBirthResponse. И отдаёт её контроллеру. 
Контроллер отправляет ответ стороннему приложению.


6.По всем меткам TODO исправить замечания. Скинуть.Только потом переходить к п.7
7.Написать реализацию метода handlePersInfoBetweenDateRequest в HolderServiceImpl.
