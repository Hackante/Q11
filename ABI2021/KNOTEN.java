public class KNOTEN extends LISTENELEMENT {
    LISTENELEMENT nachfolger;
    VERANSTALTUNG veranstaltung;

    public KNOTEN(VERANSTALTUNG veranstaltung) {
        this.veranstaltung = veranstaltung;
    }

    public void setNachfolger(LISTENELEMENT listenelement) {
        this.nachfolger = listenelement;
    }

    @Override
    public VERANSTALTUNG getVeranstaltung() {
        return this.veranstaltung;
    }

    public LISTENELEMENT getNachfolger() {
        return this.nachfolger;
    }

    public LISTENELEMENT sortiertEinfuegen(VERANSTALTUNG veranstaltung) {
        // Tag
        if (this.veranstaltung.getTag() > veranstaltung.getTag()) {
            KNOTEN k = new KNOTEN(veranstaltung);
            k.setNachfolger(this);
            return this;
        } else if (this.veranstaltung.getTag() < veranstaltung.getTag()) {
            this.nachfolger = this.nachfolger.sortiertEinfuegen(veranstaltung);
            return this;
        } else {
            // Zeitfenster
            if (this.veranstaltung.getZeitfenster() > veranstaltung.getZeitfenster()) {
                KNOTEN k = new KNOTEN(veranstaltung);
                k.setNachfolger(this);
                return this;
            } else {
                this.nachfolger = this.nachfolger.sortiertEinfuegen(veranstaltung);
                return this;
            }
        }
    }

    public int anzahlGeben(int tag, int zeitfenster) {
        if(this.veranstaltung.getTag() == tag && this.veranstaltung.getZeitfenster() == zeitfenster) {
            return this.nachfolger.anzahlGeben(tag, zeitfenster) + 1;
        } else {
            return this.nachfolger.anzahlGeben(tag, zeitfenster);
        }
    }
}
