public class ABSCHLUSS extends BAUMELEMENT {
    public ABSCHLUSS() {
        
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        return null;
    }
    
    public BAUMELEMENT einfügen(DATENELEMENT neu) {
        KNOTEN k = new KNOTEN(neu);
        return k;
    }
    
    public void printInOrder() {
        return;
    }
    
    public void printPreOrder() {
        return;
    }
    
    public void printPostOrder() {
        return;
    }
}
