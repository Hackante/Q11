public class Knot {
    private DataElement data;
    private Knot nextLeft, nextRight;

    public Knot(DataElement data) {
        this.data = data;
    }

    public void setLeft(Knot left) {
        this.nextLeft = left;
    }

    public void setRight(Knot right) {
        this.nextRight = right;
    }

    public Knot getRight() {
        return this.nextRight;
    }

    public Knot getLeft() {
        return this.nextLeft;
    }
    
    public void setData(DataElement data) {
        this.data = data;
    }
    
    public DataElement getData(){
        return this.data;
    }
}
