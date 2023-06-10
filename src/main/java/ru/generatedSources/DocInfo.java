package ru.generatedSources;

/**В реальности эти классы будут генерироваться сторонней библиотекой */
/** Блок информации о документе */

public class DocInfo {
    private String docSeries;
    private String docNumber;

    public DocInfo() {
    }

    public DocInfo(String docSeries, String docNumber) {
        this.docSeries = docSeries;
        this.docNumber = docNumber;
    }

    public String getDocSeries() {
        return docSeries;
    }

    public void setDocSeries(String docSeries) {
        this.docSeries = docSeries;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
}
