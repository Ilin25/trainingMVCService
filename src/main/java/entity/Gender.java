package main.java.entity;

public enum Gender {

    M("Мужской"),
    F("Женский");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description ;

    }

}
