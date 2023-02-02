
/**
 * Tragen Sie hier eine Beschreibung des Interface DATENELEMENT ein.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public interface DATENELEMENT
{
    public boolean istGleich(String vergleich);
    
    public boolean istKleinerAls(String vergleich);
    
    public boolean istGrößerAls(String vergleich);
    
    public boolean istGleich(DATENELEMENT neu);
    
    public boolean istKleinerAls(DATENELEMENT neu);
    
    public boolean istGrößerAls(DATENELEMENT neu);
     
    public String getName();
    
    public void setOrt(ORT ort);
}
