/**
 * Beschreiben Sie hier die Klasse KNOTEN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KNOTEN
{
    private DATENELEMENT daten;
    private KNOTEN nachfolger;   
    
    public KNOTEN(DATENELEMENT d) {
        daten = d;
        nachfolger = null;
    }
    
    // Getter- und Setter-Methoden
    public void setNachfolger(KNOTEN k){
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
        if(nachfolger == null) {
            return 1;
        }
        else {
            return nachfolger.getRestlänge() + 1;
        }
    }
    
    public double getRestjahr() {
        if(nachfolger == null) {
            return this.daten.getJahr();
        } else {
            return this.nachfolger.getRestjahr() + this.daten.getJahr();
        }
    }
}
