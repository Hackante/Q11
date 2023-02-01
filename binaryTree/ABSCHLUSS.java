public class ABSCHLUSS extends ELEMENT {
    @Override
    public DATENELEMENT suchen(String gesuchtesWort) {
        return null;
    }

    public ELEMENT einfügen(DATENELEMENT d) {
        return new KNOTEN(d);
    }

    public int getGröße() {
        return 0;
    }

    public int getTiefe(DATENELEMENT d) {
        throw new Error("Element not in binary tree.");
    }
}
