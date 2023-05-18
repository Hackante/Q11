public abstract class BAUMELEMENT {
    public abstract DATENELEMENT suchen(String gesuchtesWort);
    
    public abstract BAUMELEMENT einfügen(DATENELEMENT neu);
    
    public abstract void printInOrder();
    
    public abstract void printPreOrder();
    
    public abstract void printPostOrder();
}
