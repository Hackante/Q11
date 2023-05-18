public interface DATENELEMENT {
    public boolean istGleich(String vergleich);
    
    public boolean istKleinerAls(String vergleich);
    
    public boolean istGrößerAls(String vergleich);
    
    public boolean istGleich(DATENELEMENT neu);
    
    public boolean istKleinerAls(DATENELEMENT neu);
    
    public boolean istGrößerAls(DATENELEMENT neu);
    
    public String getWort();
    
    public String getBedeutungen();
    
    public void ausgeben();
}
