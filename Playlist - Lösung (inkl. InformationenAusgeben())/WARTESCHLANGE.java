
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

    public void alleInfosAusgeben() {
        if(anfang == null) {
            System.out.println("Es ist kein Song in der Playlist...");
        }
        else {
            anfang.restlicheInfosAusgeben();
        }
    }

}