
/**
 * Beschreiben Sie hier die Klasse Wartezimmer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LISTE
{
    private LISTENELEMENT anfang;

    public LISTE() {
        anfang = new ABSCHLUSS();
    }

    public int getLänge() {
        return this.anfang.getRestlänge();
    }
    
    public void hintenEinfügen(KNOTEN knoten) {
        this.anfang = this.anfang.hintenEinfügen(knoten);
    }
    
    public void hintenEinfügen(DATENELEMENT datenelement) {
        this.hintenEinfügen(new KNOTEN(datenelement));
    }
    
    public void vorneEinfügen(DATENELEMENT datenelement) {
        this.anfang = this.anfang.vorneEinfügen(new KNOTEN(datenelement));
    }
}