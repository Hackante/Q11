
public class ORT implements DATENELEMENT
{
    String name;
    
    public ORT(String name)
    {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public boolean istGleich(String vergleich) {
        return name.compareTo(vergleich) == 0;
    }
    
    public boolean istKleinerAls(String vergleich) {
        return name.compareTo(vergleich) < 0;
    }
    
    public boolean istGrößerAls(String vergleich) {
        return name.compareTo(vergleich) > 0;
    }
    
    public boolean istGleich(DATENELEMENT neu) {
        return name.compareTo(neu.getName()) == 0;
    }
    
    public boolean istKleinerAls(DATENELEMENT neu) {
        return name.compareTo(neu.getName()) < 0;
    }
    
    public boolean istGrößerAls(DATENELEMENT neu) {
        return name.compareTo(neu.getName()) > 0;
    }
}
