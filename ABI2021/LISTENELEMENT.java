public abstract class LISTENELEMENT {

    public abstract LISTENELEMENT sortiertEinfuegen(VERANSTALTUNG veranstaltung);

    public abstract void setNachfolger(LISTENELEMENT listenelement);

    public abstract LISTENELEMENT getNachfolger();

    public VERANSTALTUNG getVeranstaltung() {
        return null;
    }

    public abstract int anzahlGeben(int tag, int zeitfenster);
}
