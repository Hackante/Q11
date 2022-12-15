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
