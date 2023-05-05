package ru.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Card {
    private String number;
    private LocalDate issueDate;
    private boolean isActive;
    private Bank bank;
    private LocalDate valDate;

    public Card(String number, LocalDate issueDate, boolean isActive,Bank bank,LocalDate valDate) {
        this.number = number;
        this.issueDate = issueDate;
        this.isActive = isActive;
        this.bank = bank;
        this.valDate = valDate;
    }
    public Card(){

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public boolean setIsActive(boolean active ) {
        return this.isActive = active;}


    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public LocalDate getValDate() {
        return valDate;
    }

    public void setValDate(LocalDate valDate) {
        this.valDate = valDate;
    }

    public String toString() {
        String result = String.format("%s %s %s %s %s.%n",bank,number,issueDate,isActive,valDate);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(number, card.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }


}


