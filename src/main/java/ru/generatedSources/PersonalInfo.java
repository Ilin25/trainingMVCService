package ru.generatedSources;

/**В реальности эти классы будут генерироваться сторонней библиотекой */
/**Блок ФИО*/

public class PersonalInfo {

    private String lastName;
    private String firstName;
    private String middleName;
    private String fullAddress;

    public PersonalInfo() {
    }

    public PersonalInfo(String lastName, String firstName, String middleName, String fullAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullAddress = fullAddress;
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

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
