package main.java.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Card {
    private String number; // 12 цифр
    private LocalDate issueDate;
    private boolean isActive;

    public Card(String number, LocalDate issueDate, boolean isActive) {
        this.number = number;
        this.issueDate = issueDate;
        this.isActive = isActive;
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

    public boolean isActive() {
        return isActive;
    }


    public String toString() {
        String result = String.format("%s %s %s.%n",number,issueDate,isActive);
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


