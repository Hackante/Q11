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
    
    public boolean istGleich(DATENELEMENT vergleich) {
        return wort.compareTo(vergleich.getCompareValue()) == 0;
    }
    
    public boolean istKleinerAls(DATENELEMENT vergleich) {
        return wort.compareTo(vergleich.getCompareValue()) < 0;
    }
    
    public boolean istGrößerAls(DATENELEMENT vergleich) {
        return wort.compareTo(vergleich.getCompareValue()) > 0;
    }
    
    public String getCompareValue() {
        return this.wort;
    }
}
