public class KNOTEN extends ELEMENT {
    private KNOTEN linkerNachfolger, rechterNachfolger;
    private DATENELEMENT daten;
    
    public KNOTEN(DATENELEMENT d) {
        daten = d;
        linkerNachfolger = null;
        rechterNachfolger = null;
    }
    
    public DATENELEMENT getDaten() {
        return daten;
    }
    
    public void setDaten(DATENELEMENT d) {
        daten = d;
    }
    
    public KNOTEN getLinkerNachfolger() {
        return linkerNachfolger;
    }
    
    public void setLinkerNachfolger(KNOTEN k) {
        linkerNachfolger = k;
    }
    
    public KNOTEN getRechterNachfolger() {
        return rechterNachfolger;
    }
    
    public void setRechterNachfolger(KNOTEN k) {
        rechterNachfolger = k;
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        if(daten.istGleich(gesuchtesWort)) {
            return this.daten;
        } else if(daten.istKleinerAls(gesuchtesWort) && rechterNachfolger != null) {
            return this.rechterNachfolger.suchen(gesuchtesWort);
        } else if(daten.istGrößerAls(gesuchtesWort) && linkerNachfolger != null) {
            return this.linkerNachfolger.suchen(gesuchtesWort);
        } 
        return null;
    }
    
    public KNOTEN einfügen(DATENELEMENT d) {
        if(d.istGrößerAls(this.daten)) {
            this.rechterNachfolger = this.rechterNachfolger != null ? rechterNachfolger.einfügen(d) : new KNOTEN(d);
        } else if(d.istKleinerAls(this.daten)) {
            this.linkerNachfolger = this.linkerNachfolger != null ? linkerNachfolger.einfügen(d) : new KNOTEN(d);
        } else {
            System.out.println("Already in binary tree");
        }
        return this;
    }
}
