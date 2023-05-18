public class BINÄRBAUM {
    private BAUMELEMENT wurzel;
    
    /**
     * Konstruktor für Objekte der Klasse BINÄRBAUM
     */
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
    
    public void printInOrder() {
        this.wurzel.printInOrder();
    }
    
    public void printPreOrder() {
        this.wurzel.printPreOrder();
    }
    
    public void printPostOrder() {
        this.wurzel.printPostOrder();
    }
}
