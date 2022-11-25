import java.util.Date;

public class BESUCHER {
    private Date geburtsdatum;
    private String email;
    private String name;
    private KUNSTWERK[] likes;
    private VERANSTALTUNGSLISTE gebucht;

    public BESUCHER(Date geburtsdatum, String email, String name) {
        this.geburtsdatum = geburtsdatum;
        this.email = email;
        this.name = name;
    }

    public Date getGeburtsdatum() {
        return this.geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KUNSTWERK[] getLikes() {
        return this.likes;
    }

    public void buchen(VERANSTALTUNG veranstaltung) {
        gebucht.sortiertEinfuegen(veranstaltung);
    }

    public int anzahlGeben(int tag, int zeitfenster) {
        return gebucht.anzahlGeben(tag, zeitfenster);
    }
}
