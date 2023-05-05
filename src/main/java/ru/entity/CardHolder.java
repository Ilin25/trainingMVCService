package ru.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class CardHolder {

    private List<Card> cards;
    private Address addresses;
    private PersDocument persDocument;
    private PersInfo persInfo;



    public CardHolder() {

    }

    public CardHolder(PersInfo persInfo,PersDocument persDocument, List cards, Address addresses) {
        this.persInfo = persInfo;
        this.persDocument = persDocument;
        this.cards = cards;
        this.addresses =addresses;

    }



    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }

    public PersDocument getPersDocument() {
        return persDocument;
    }

    public void setPersDocument(PersDocument persDocument) {
        this.persDocument = persDocument;
    }

    public PersInfo getPersInfo() {
        return persInfo;
    }

    public void setPersInfo(PersInfo persInfo) {
        this.persInfo = persInfo;
    }

    @Override
    public String toString() {
        String result = String.format("%s  %s  %s%n" ,persDocument,persInfo,addresses);
        return result;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        CardHolder holder = (CardHolder) o;
//        return Objects.equals(lastName, holder.lastName)
//                && Objects.equals(firstName, holder.firstName)
//                && Objects.equals(middleName, holder.middleName)
//                && Objects.equals(dateOfBirth, holder.dateOfBirth)
//                && Objects.equals(gender, holder.gender) && Objects.equals(cards, holder.cards)
//                && Objects.equals(age, holder.age)
//                && Objects.equals(addresses, holder.addresses);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(lastName, firstName, middleName, dateOfBirth, gender, cards, age);
//    }
//
//    public boolean isHasNotActiveCards() {
//        for (Card card : this.cards) {
//            if (!card.isActive()) {
//                return true;
//            }
//        }
//        return false;
//    }


    }
