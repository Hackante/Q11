public class WARTEZIMMER {
    private int anzahl;
    private KNOTEN anfang;

    public WARTEZIMMER(KNOTEN anfang) {
        anzahl = 1;
        this.anfang = anfang;
    }

    public void einfügen(PATIENT p) {
        einfügen(new KNOTEN(p));
    }

    public void einfügen(KNOTEN k) {
        if (this.anfang == null) {
            this.anfang = k;
            return;
        }
        KNOTEN next = this.anfang;
        while (next.getNachfolger() != null) {
            next = next.getNachfolger();
        }
        next.setNachfolger(k);
        this.anzahl++;
    }

    public PATIENT entfernen() {
        KNOTEN x = this.anfang;
        if (x == null)
            return null;
        this.anfang = this.anfang.getNachfolger();
        this.anzahl--;
        return x.getPatient();
    }

    public int getAnzahl() {
        return anzahl;
    }
}