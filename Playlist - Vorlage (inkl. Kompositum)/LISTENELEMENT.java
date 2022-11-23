
/**
 * Tragen Sie hier eine Beschreibung des Interface LISTENELEMENT ein.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public abstract class LISTENELEMENT
{   
    public abstract int getRestlänge();
    
    public abstract KNOTEN hintenEinfügen(KNOTEN knoten);
    
    public KNOTEN vorneEinfügen(KNOTEN knoten) {
        knoten.setNachfolger(this);
        return knoten;
    }
}