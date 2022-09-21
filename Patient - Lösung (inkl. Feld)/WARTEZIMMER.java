public class WARTEZIMMER
{
    private int anzahl;
    private PATIENT anfang;
    
    public WARTEZIMMER(PATIENT anfang) {
        anzahl = 0;
        this.anfang = anfang;
    }
    
    public void einfügen(PATIENT p) {
        PATIENT x = anfang;
        while(x.getNachfolger() != null) {
            x = x.getNachfolger();
        }
        x.setNachfolger(p);
    }
    
    public PATIENT entfernen() {
        return this.anfang; // Platzhaltrer. keine fehler :)
    }
    
    public int getAnzahl() {
        return anzahl;        
    }
}