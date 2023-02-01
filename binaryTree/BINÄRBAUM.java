public class BINÄRBAUM {
    private ELEMENT wurzel;

    public BINÄRBAUM()
    {
        wurzel = new ABSCHLUSS();
    }

    public ELEMENT getWurzel() {
        return wurzel;
    }
    
    public void setWurzel(ELEMENT k) {
        wurzel = k;
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        return wurzel.suchen(gesuchtesWort);
    }
    
    public void einfügen(DATENELEMENT d) {
        this.wurzel = this.wurzel == null ? new KNOTEN(d) : this.wurzel.einfügen(d);
    }
    
    public int getGröße() {
        return this.wurzel.getGröße();
    }
    
    public int getTiefe(DATENELEMENT d) {
        return this.wurzel.getTiefe(d);
    }
}
