
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
    private double dauer;
    private double bewertung;
    private double jahr;
    private double preis;
    
    public SONG(String i, String t, double d, double b, double j, double p) {
        interpret = i;
        titel = t;
        dauer = d;
        bewertung = b;
        jahr = j;
        preis = p;
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
    
    public double getDauer() {
        return dauer;
    }
    
    public void setDauer(double d) {
        dauer = d;
    }
    
    public double getBewertung() {
        return bewertung;
    }
    
    public void setBewertung(double b) {
        bewertung = b;
    }
    
    public double getJahr() {
        return jahr;
    }
    
    public void setJahr(double j) {
        jahr = j;
    }
    
    public double getPreis() {
        return preis;
    }
    
    public void setPreis(double p) {
        preis = p;
    }

    public void ausgeben() {
        System.out.println(interpret + ": " + titel);
    }
}