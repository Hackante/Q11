
/**
 * Beschreiben Sie hier die Klasse KNOTEN.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KNOTEN {
    private DATENELEMENT daten;
    private KNOTEN nachfolger;

    public KNOTEN(DATENELEMENT d) {
        daten = d;
        nachfolger = null;
    }

    // Getter- und Setter-Methoden
    public void setNachfolger(KNOTEN k) {
        nachfolger = k;
    }

    public KNOTEN getNachfolger() {
        return nachfolger;
    }

    public void setDaten(DATENELEMENT d) {
        daten = d;
    }

    public DATENELEMENT getDaten() {
        return daten;
    }

    public void ausgeben() {
        daten.ausgeben();
    }

    public int getRestlänge() {
        if (nachfolger == null) {
            return 1;
        } else {
            return nachfolger.getRestlänge() + 1;
        }
    }

    public void restlicheInfosAusgeben() {
        if (nachfolger == null) {
            daten.ausgeben();
        } else {
            nachfolger.restlicheInfosAusgeben();
            daten.ausgeben();
        }
    }

    public void einfügen(DATENELEMENT datenelement) {
        if (this.nachfolger == null)
            this.setNachfolger(new KNOTEN(datenelement));
        else
            this.nachfolger.einfügen(datenelement);
    }

    public void einfügenVorMe(DATENELEMENT datenelement, DATENELEMENT vergleich) {
        if(this.getNachfolger() == null) {
            this.setNachfolger(new KNOTEN(datenelement));
        } else if(vergleich == this.getNachfolger().getDaten()) {
            KNOTEN k = new KNOTEN(datenelement);
            k.setNachfolger(this.getNachfolger());
            this.setNachfolger(k);
        } else if (this.getNachfolger() != null) {
            this.nachfolger.einfügenVorMe(datenelement, vergleich);
        }
    }

    public KNOTEN einfügenVor(DATENELEMENT datenelement, DATENELEMENT vergleich) {
        if(this.getDaten() == vergleich) {
            KNOTEN k = new KNOTEN(datenelement);
            k.setNachfolger(this);
            return k;
        } else if(this.getNachfolger() == null) {
            einfügen(datenelement);
            return this;
        } else {
            this.setNachfolger(einfügenVor(datenelement, vergleich));
            return this;
        }
    }

    public DATENELEMENT suchen(String titel) {
        if(this.getDaten().istGleich(titel)) return this.getDaten();
        
    }
}
