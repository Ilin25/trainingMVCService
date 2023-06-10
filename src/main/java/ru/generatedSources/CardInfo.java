package ru.generatedSources;

/**В реальности эти классы будут генерироваться сторонней библиотекой */
/** Блок информации о карте */

public class CardInfo {

    private String cardNumber;
    private String bankBik;
    private String bankName;

    public CardInfo() {
    }

    public CardInfo(String cardNumber, String bankBik, String bankName) {
        this.cardNumber = cardNumber;
        this.bankBik = bankBik;
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankBik() {
        return bankBik;
    }

    public void setBankBik(String bankBik) {
        this.bankBik = bankBik;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
