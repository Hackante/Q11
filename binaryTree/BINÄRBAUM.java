public class BINÄRBAUM {
    private KNOTEN wurzel;

    public BINÄRBAUM()
    {
        wurzel = null;
    }

    public KNOTEN getWurzel() {
        return wurzel;
    }
    
    public void setWurzel(KNOTEN k) {
        wurzel = k;
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        if(wurzel == null) {
            return null;
        }
        else return wurzel.suchen(gesuchtesWort);
    }
    
    public void einfügen(DATENELEMENT d) {
        this.wurzel = this.wurzel.einfügen(d);
    }
}
