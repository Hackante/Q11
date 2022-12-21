public class Node {
    private DataElement data;
    private Node nextLeft, nextRight;

    public Node(DataElement data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.nextLeft = left;
    }

    public void setRight(Node right) {
        this.nextRight = right;
    }

    public Node getRight() {
        return this.nextRight;
    }

    public Node getLeft() {
        return this.nextLeft;
    }
    
    public void setData(DataElement data) {
        this.data = data;
    }
    
    public DataElement getData(){
        return this.data;
    }
    
    // rekursiv
    public DataElement suchenRekursiv(String vergleich){
        if(this.data.istGleich(vergleich)) {
            return this.data;
        } else {
            DataElement left = this.nextLeft != null? this.nextLeft.suchenRekursiv(vergleich) : null;
            DataElement right = this.nextRight != null ? this.nextRight.suchenRekursiv(vergleich) : null;
            if(left == null && right == null) {
                return null;
            } else {
                return left == null ? right : left;
            }
        }
    }
}
