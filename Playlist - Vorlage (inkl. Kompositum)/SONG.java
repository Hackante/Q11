
/**
 * Beschreiben Sie hier die Klasse Patient.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SONG implements DATENELEMENT
{
    private String interpret;
    private String titel;
    
    public SONG(String i, String t) {
        interpret = i;
        titel = t;
    }

    // Getter- und Setter-Methoden
    public String getInterpret() {
        return interpret;
    }
    
    public void setInterpret(String i) {
        interpret = i;
    }
    
    public String getTitel() {
        return titel;
    }
    
    public void setTitel(String t) {
        titel = t;
    }

    public void ausgeben() {
        System.out.println(interpret + ": " + titel);
    }
  
}