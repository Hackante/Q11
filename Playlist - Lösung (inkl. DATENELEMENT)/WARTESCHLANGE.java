
/**
 * Beschreiben Sie hier die Klasse Wartezimmer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WARTESCHLANGE
{
    private int anzahl;
    private KNOTEN anfang;

    public WARTESCHLANGE() {
        anzahl = 0;
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
        anzahl++;
    }

    public KNOTEN entfernen() {
        KNOTEN nächster = anfang;
        anfang = anfang.getNachfolger();
        anzahl--;
        return nächster;
    }

    public int getAnzahl() {
        return anzahl;        
    }

}