public class BinaryTree {
    private Knot root;

    public BinaryTree() {

    }

    public void setRoot(Knot root) {
        this.root = root;
    }

    public Knot getRoot() {
        return this.root;
    }
    
    public DataElement suchenRekursiv(String vergleich) {
        return this.root.suchenRekursiv(vergleich);
    }
}
