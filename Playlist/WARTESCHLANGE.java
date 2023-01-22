/**
 * Beschreiben Sie hier die Klasse Wartezimmer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WARTESCHLANGE
{
    private KNOTEN anfang;

    public WARTESCHLANGE() {
        anfang = null;
    }

    public void einfügen(KNOTEN k) {
        if(anfang == null) {
            anfang = k;
        }
        else {
            KNOTEN aktuell = anfang;
            while(aktuell.getNachfolger() != null) {
                aktuell = aktuell.getNachfolger();
            }
            aktuell.setNachfolger(k);
        }
    }

    public KNOTEN entfernen() {
        KNOTEN nächster = anfang;
        anfang = anfang.getNachfolger();
        return nächster;
    }

    public int getLänge() {
        if(anfang == null) {
            return 0;
        }
        else {
            return anfang.getRestlänge();   
        }        
    }

    public double getGesamtdauer() {
        if(anfang == null) {
            return 0;
        }
        else {
            return anfang.getRestdauer();   
        }        
    }
    
    public double getDurchschnittsbewertung() {
        if(anfang == null) {
            return 0;
        }
        else {
            return anfang.getRestbewertung() / getLänge();
        } 
    }
      
    public double getAktualität() {
        if(anfang == null) {
            return 0;
        }
        else {
            return 2022 - Math.round(anfang.getRestjahr() / getLänge());
        }
    }
    
    public boolean istKostenlos() {
        if(anfang == null) {
            return true;
        }
        else {
            return (anfang.getRestpreis() == 0);
        }
    }
    
    public void alleInfosAusgeben() {
        if(anfang == null) {
            System.out.println("Es ist kein Song in der Playlist...");
        }
        else {
            anfang.restlicheInfosAusgeben();
        }
    }
}