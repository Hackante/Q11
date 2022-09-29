public class WARTESCHLANGE {
    private KNOTEN anfang;
    private int anzahl;

    public WARTESCHLANGE(KNOTEN anfang) {
        this.anfang = anfang;
        this.anzahl = 0;
    }

    public void setAnfang(KNOTEN anfang) {
        this.anfang = anfang;
    }

    public KNOTEN getAnfang() {
        return anfang;
    }

    public int getAnzahl() {
        return anzahl;
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

    public KNOTEN entfernen() {
        KNOTEN x = this.anfang;
        if (x == null)
            return null;
        this.anfang = this.anfang.getNachfolger();
        this.anzahl--;
        return x;
    }
}
