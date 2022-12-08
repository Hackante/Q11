public class SONG {
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

    public String ausgeben() {
        return interpret + ": " + titel;
    }
}