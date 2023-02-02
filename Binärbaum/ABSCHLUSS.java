
/**
 * Beschreiben Sie hier die Klasse ABSCHLUSS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ABSCHLUSS extends BAUMELEMENT
{
    public ABSCHLUSS() {
        
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        return null;
    }
    
    public BAUMELEMENT einfügen(DATENELEMENT neu) {
        KNOTEN k = new KNOTEN(neu);
        return k;
    }
    
    public BAUMELEMENT ortÄndern(String name, ORT ort) {
        return this;
    }
}
