package ru.entity;

import java.time.LocalDate;

public class PersDocument {
    private String series;
    private String number;
    private LocalDate issueDate;
    private LocalDate valDate;

    public PersDocument(){
    }

    public PersDocument(String series, String number, LocalDate issueDate, LocalDate valDate) {
        this.series = series;
        this.number = number;
        this.issueDate = issueDate;
        this.valDate = valDate;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
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

    public LocalDate getValDate() {
        return valDate;
    }

    public void setValDate(LocalDate valDate) {
        this.valDate = valDate;
    }

    @Override
    public String toString() {
        String result = String.format("серия %s. номер %s. %s %s" ,series,number,issueDate,valDate);
        return result;
    }
}
