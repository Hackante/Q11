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
        if(wurzel == null) {
            return null;
        }
        else return wurzel.suchen(gesuchtesWort);
    }
    
    public void einfügen(DATENELEMENT d) {
        this.wurzel = this.wurzel == null ? new KNOTEN(d) : this.wurzel.einfügen(d);
    }
}
