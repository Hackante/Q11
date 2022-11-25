public class VERANSTALTUNGSLISTE {
    LISTENELEMENT anfang;

    public VERANSTALTUNGSLISTE() {
        this.anfang = new ABSCHLUSS();
    }

    public void sortiertEinfuegen(VERANSTALTUNG veranstaltung) {
        this.anfang = this.anfang.sortiertEinfuegen(veranstaltung);
    }

    public int anzahlGeben(int tag, int zeitfenster) {
        return this.anfang.anzahlGeben(tag, zeitfenster);
    }
}
