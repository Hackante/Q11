public class BinaryTree {
    private Node root;

    public BinaryTree() {

    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }
    
    public DataElement suchenRekursiv(String vergleich) {
        return this.root.suchenRekursiv(vergleich);
    }
}
