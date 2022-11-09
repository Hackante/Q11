/**
 * Beschreiben Sie hier die Klasse Wartezimmer.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LISTE {
    private KNOTEN anfang;

    public LISTE() {
        anfang = null;
    }

    public KNOTEN entfernen() {
        KNOTEN nächster = anfang;
        anfang = anfang.getNachfolger();
        return nächster;
    }

    public int getLänge() {
        if (anfang == null) {
            return 0;
        } else {
            return anfang.getRestlänge();
        }
    }

    public void alleInfosAusgeben() {
        if (anfang == null) {
            System.out.println("Es ist kein Song in der Playlist...");
        } else {
            anfang.restlicheInfosAusgeben();
        }
    }

    public void vorneEinfügen(DATENELEMENT datenelement) {
        KNOTEN k = new KNOTEN(datenelement);
        if (anfang == null)
            this.anfang = k;
        else {
            k.setNachfolger(this.anfang);
            this.anfang = k;
        }
    }

    public void hintenEinfügen(DATENELEMENT datenelement) {
        if (this.anfang == null)
            vorneEinfügen(datenelement);
        else
            this.anfang.einfügen(datenelement);
    }

    public void einfügenBei(int position, DATENELEMENT datenelement) {
        if (this.anfang == null || position == 1)
            vorneEinfügen(datenelement);
        KNOTEN current = this.anfang;
        for (int i = 2; i < position; i++) {
            if (current.getNachfolger() != null)
                current = current.getNachfolger();
            else
                this.hintenEinfügen(datenelement);
        }
        KNOTEN k = new KNOTEN(datenelement);
        k.setNachfolger(current.getNachfolger());
        current.setNachfolger(k);
    }

    public void einfügenVor(DATENELEMENT datenelement, DATENELEMENT vergleich) {
        if(this.anfang == null) vorneEinfügen(datenelement);
        else this.anfang.einfügenVor(datenelement, vergleich);
    }
}