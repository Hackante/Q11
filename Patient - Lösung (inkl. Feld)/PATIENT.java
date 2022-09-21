public class PATIENT
{
    private String name;
    private String krankheit;
    private PATIENT nachfolger;
    
    public PATIENT(String n, String k) {
        this.name = n;
        this.krankheit = k;
        this.nachfolger = nachfolger;
    }

    // Getter- und Setter-Methoden
    public void setName(String n) {
        name = n;        
    }
    
    public String getName() {
        return name;
    }
    
    public void setKrankheit(String k) {
        krankheit = k;
    }
    
    public String getKrankheit() {
        return krankheit;
    }
    
    public PATIENT getNachfolger() {
        return this.nachfolger;
    }
    
    public void setNachfolger(PATIENT p) {
        this.nachfolger = p;
    }
}