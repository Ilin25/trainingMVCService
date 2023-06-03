package ru.entity;
import java.util.List;
import java.util.Objects;


public class CardHolder {

    private List<Card> cards;
    private Address addresses;
    private PersDocument persDocument;
    private PersInfo persInfo;


    public CardHolder() {

    }

    public CardHolder(List<Card> cards, Address addresses, PersDocument persDocument, PersInfo persInfo) {
        this.cards = cards;
        this.addresses = addresses;
        this.persDocument = persDocument;
        this.persInfo = persInfo;
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
        String result = String.format("Документ : %s%nПерсинфо: %s%nАдрес: %s%n" ,persDocument,persInfo,addresses);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CardHolder)) return false;

        CardHolder that = (CardHolder) o;

        if (!Objects.equals(cards, that.cards)) return false;
        if (!Objects.equals(addresses, that.addresses)) return false;
        if (!Objects.equals(persDocument, that.persDocument)) return false;
        return Objects.equals(persInfo, that.persInfo);
    }

    @Override
    public int hashCode() {
        int result = cards != null ? cards.hashCode() : 0;
        result = 31 * result + (addresses != null ? addresses.hashCode() : 0);
        result = 31 * result + (persDocument != null ? persDocument.hashCode() : 0);
        result = 31 * result + (persInfo != null ? persInfo.hashCode() : 0);
        return result;
    }

}
