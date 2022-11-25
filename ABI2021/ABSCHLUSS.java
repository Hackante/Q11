public class ABSCHLUSS extends LISTENELEMENT {

    public ABSCHLUSS() {

    }

    public void setNachfolger(LISTENELEMENT listenelement) {
        return;
    }

    public LISTENELEMENT sortiertEinfuegen(VERANSTALTUNG veranstaltung) {
        KNOTEN k = new KNOTEN(veranstaltung);
        k.setNachfolger(this);
        return k;
    }

    public LISTENELEMENT getNachfolger() {
        return null;
    }

    public int anzahlGeben(int tag, int zeitfenster) {
        return 0;
    }
}
