public class WARTEZIMMER {
    private int anzahl;
    private PATIENT anfang;

    public WARTEZIMMER(PATIENT anfang) {
        anzahl = 1;
        this.anfang = anfang;
    }

    public void einfügen(PATIENT p) {
        if (this.anfang == null) {
            this.anfang = p;
            return;
        }
        PATIENT next = this.anfang;
        while (next.getNachfolger() != null) {
            next = next.getNachfolger();
        }
        next.setNachfolger(p);
        this.anzahl++;
    }

    public PATIENT entfernen() {
        PATIENT x = this.anfang;
        this.anfang = this.anfang.getNachfolger();
        this.anzahl--;
        return x;
    }

    public int getAnzahl() {
        return anzahl;
    }
}