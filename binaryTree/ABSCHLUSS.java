public class ABSCHLUSS extends ELEMENT {
    @Override
    public DATENELEMENT suchen(String gesuchtesWort) {
        return null;
    }
    
    public ELEMENT einfügen(DATENELEMENT d) {
        return new KNOTEN(d);
    }
}
