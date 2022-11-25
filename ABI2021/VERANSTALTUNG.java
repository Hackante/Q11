public class VERANSTALTUNG {
    private ORT ort;
    private int tag;
    private int zeitfenster;
    private String name;

    public int getTag() {
        return this.tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getZeitfenster() {
        return this.zeitfenster;
    }

    public void setZeitfenster(int zeitfenster) {
        this.zeitfenster = zeitfenster;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VERANSTALTUNG(ORT ort) {
        this.ort = ort;
    }

    public ORT getOrt() {
        return this.ort;
    }

    public void setOrt(ORT ort) {
        this.ort = ort;
    }
}
