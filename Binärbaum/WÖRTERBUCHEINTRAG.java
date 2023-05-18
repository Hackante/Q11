public class WÖRTERBUCHEINTRAG implements DATENELEMENT {
    private String wort;
    private String bedeutungen;
    
    public WÖRTERBUCHEINTRAG(String w, String b) {
        wort = w;
        bedeutungen = b;
    }
    
    public String getWort() {
        return wort;
    }
    
    public void setWort(String w) {
        wort = w;
    }
    
    public String getBedeutungen() {
        return bedeutungen;
    }
    
    public void setBedeutungen(String b) {
        bedeutungen = b;
    }
    
    public boolean istGleich(String vergleich) {
        return wort.compareTo(vergleich) == 0;
    }
    
    public boolean istKleinerAls(String vergleich) {
        return wort.compareTo(vergleich) < 0;
    }
    
    public boolean istGrößerAls(String vergleich) {
        return wort.compareTo(vergleich) > 0;
    }
    
    public boolean istGleich(DATENELEMENT neu) {
        return wort.compareTo(neu.getWort()) == 0;
    }
    
    public boolean istKleinerAls(DATENELEMENT neu) {
        return wort.compareTo(neu.getWort()) < 0;
    }
    
    public boolean istGrößerAls(DATENELEMENT neu) {
        return wort.compareTo(neu.getWort()) > 0;
    }
    
    public void ausgeben() {
        System.out.printf("Englisch: %s, Deutsch: %s\n", wort, bedeutungen);
    }
}
