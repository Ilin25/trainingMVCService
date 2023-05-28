package ru.entity;

import java.time.LocalDate;

public class PersInfo {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;
    private Enum<Gender> gender;


    public PersInfo(){

    }

    public PersInfo(String lastName, String firstName, String middleName, LocalDate dateOfBirth, Enum<Gender> gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;

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



    public String toString() {
//        String declinationOfWordYears = null;
//        if (getAge() > 4 & getAge() < 21) {
//            declinationOfWordYears = "лет";
//        } else if (getAge() % 10 == 1) {
//            declinationOfWordYears = "год";
//        } else if (getAge() % 10 >= 2 & getAge() % 10 <= 4) {
//            declinationOfWordYears = "года";
//        } else if (getAge() % 10 >= 5 | getAge() % 10 == 0) {
//            declinationOfWordYears = "лет";
//        }
        String result = String.format("%s %s %s %s %s",lastName,firstName,middleName,dateOfBirth,gender);
        return result;
    }

}
