public interface DATENELEMENT {
    public boolean istGleich(String vergleich);
    
    public boolean istKleinerAls(String vergleich);
    
    public boolean istGrößerAls(String vergleich);
    
    public boolean istGleich(DATENELEMENT vergleich);
    
    public boolean istKleinerAls(DATENELEMENT vergleich);
    
    public boolean istGrößerAls(DATENELEMENT vergleich);
    
    public String getCompareValue();
}
