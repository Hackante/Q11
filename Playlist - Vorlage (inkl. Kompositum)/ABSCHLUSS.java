
/**
 * Beschreiben Sie hier die Klasse ABSCHLUSS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ABSCHLUSS extends LISTENELEMENT
{
    public ABSCHLUSS() {

    }

    public int getRestlänge() {
        return 0;
    }
    
    public KNOTEN hintenEinfügen(KNOTEN knoten) {
        knoten.setNachfolger(this);
        return knoten;
    }
}
