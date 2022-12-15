public interface DataElement {
    public DataElement getData();
    
    public boolean istGleich(String vergleich);
    
    public boolean istKleinerAls(String vergleich);
    
    public boolean istGrößerAls(String vergleich);
}
