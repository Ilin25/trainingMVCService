package main.java.entity;

import main.java.entity.Address;
import main.java.entity.Card;
import main.java.entity.Gender;
import main.java.entity.Bank;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class CardHolder {

    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;
    private Enum<Gender> gender;
    private List<Card> cards;
    private int age;
    private Address addresses;


    public CardHolder() {

    }

    public CardHolder(String lastName, String firstName, String middleName, LocalDate dateOfBirth,
                      Enum gender, List cards, int age, Address addresses) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cards = cards;
        this.age = age;
        this.addresses =addresses;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Enum<Gender> getGender() {
        return gender;
    }

    public void setGender(Enum<Gender> gender) {
        this.gender = gender;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }



    @Override
    public String toString() {
        String declinationOfWordYears = null;
        if (getAge() > 4 & getAge() < 21) {
            declinationOfWordYears = "лет";
        } else if (getAge() % 10 == 1) {
            declinationOfWordYears = "год";
        } else if (getAge() % 10 >= 2 & getAge() % 10 <= 4) {
            declinationOfWordYears = "года";
        } else if (getAge() % 10 >= 5 | getAge() % 10 == 0) {
            declinationOfWordYears = "лет";
        }

        String result = String.format("%s %s %s %s %s %s %s%n" ,lastName, firstName, middleName, dateOfBirth,
                age +" "+ declinationOfWordYears,addresses , gender);

        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardHolder holder = (CardHolder) o;
        return Objects.equals(lastName, holder.lastName)
                && Objects.equals(firstName, holder.firstName)
                && Objects.equals(middleName, holder.middleName)
                && Objects.equals(dateOfBirth, holder.dateOfBirth)
                && Objects.equals(gender, holder.gender) && Objects.equals(cards, holder.cards)
                && Objects.equals(age, holder.age)
                && Objects.equals(addresses, holder.addresses);

    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName, dateOfBirth, gender, cards, age);
    }

    public boolean isHasNotActiveCards() {
        for (Card card : this.cards) {
            if (!card.isActive()) {
                return true;
            }
        }
        return false;
    }


    }
