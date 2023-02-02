public class BINÄRBAUM
{
    private BAUMELEMENT wurzel;
    
    public BINÄRBAUM()
    {
        wurzel = new ABSCHLUSS();
    }

    public BAUMELEMENT getWurzel() {
        return wurzel;
    }
    
    public void setWurzel(BAUMELEMENT k) {
        wurzel = k;
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        return wurzel.suchen(gesuchtesWort);
    }
    
    public void einfügen(DATENELEMENT neu) {
        wurzel = wurzel.einfügen(neu);
    }
    
    public void ortÄndern(String name, ORT ort) {
        this.wurzel = this.wurzel.ortÄndern(name, ort);
    }
}
