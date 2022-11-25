public class ORT {
    private CAMP camp;
    private VERANSTALTUNG[] veranstaltungen;
    private KUNSTWERK[] kunstwerke;
    private String ort;

    public ORT(String ort) {
        this.ort = ort;
    }

    public ORT(CAMP camp, String ort, int veranstaltungenAnzahl, int kunstwerkeAnzahl) {
        this.camp = camp;
        this.ort = ort;
        veranstaltungen = new VERANSTALTUNG[veranstaltungenAnzahl];
        kunstwerke = new KUNSTWERK[kunstwerkeAnzahl];
    }

    public CAMP getCamp() {
        return this.camp;
    }

    public void setCamp(CAMP camp) {
        this.camp = camp;
    }

    public VERANSTALTUNG[] getVeranstaltungen() {
        return this.veranstaltungen;
    }

    public void setVeranstaltungen(VERANSTALTUNG[] veranstaltungen) {
        this.veranstaltungen = veranstaltungen;
    }

    public KUNSTWERK[] getKunstwerke() {
        return this.kunstwerke;
    }

    public void setKunstwerke(KUNSTWERK[] kunstwerke) {
        this.kunstwerke = kunstwerke;
    }

    public String getOrt() {
        return this.ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
