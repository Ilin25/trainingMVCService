package ru.generatedSources;

import java.util.List;
/**В реальности эти классы будут генерироваться сторонней библиотекой */
/** Блок иперсональной информации */

public class PersInfoResponse {

    private PersonalInfo personalInfo;
    private DocInfo docInfo;
    private List<CardInfo> cardInfos;

    public PersInfoResponse() {
    }

    public PersInfoResponse(PersonalInfo personalInfo, DocInfo docInfo, List<CardInfo> cardInfos) {
        this.personalInfo = personalInfo;
        this.docInfo = docInfo;
        this.cardInfos = cardInfos;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public DocInfo getDocInfo() {
        return docInfo;
    }

    public void setDocInfo(DocInfo docInfo) {
        this.docInfo = docInfo;
    }

    public List<CardInfo> getCardInfos() {
        return cardInfos;
    }

    public void setCardInfos(List<CardInfo> cardInfos) {
        this.cardInfos = cardInfos;
    }

}
