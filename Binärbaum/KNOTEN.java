public class KNOTEN extends BAUMELEMENT {
    private BAUMELEMENT linkerNachfolger, rechterNachfolger;
    private DATENELEMENT daten;

    public KNOTEN(DATENELEMENT d) {
        daten = d;
        linkerNachfolger = new ABSCHLUSS();
        rechterNachfolger = new ABSCHLUSS();
    }

    public DATENELEMENT getDaten() {
        return daten;
    }

    public void setDaten(DATENELEMENT d) {
        daten = d;
    }

    public BAUMELEMENT getLinkerNachfolger() {
        return linkerNachfolger;
    }

    public void setLinkerNachfolger(BAUMELEMENT k) {
        linkerNachfolger = k;
    }

    public BAUMELEMENT getRechterNachfolger() {
        return rechterNachfolger;
    }

    public void setRechterNachfolger(BAUMELEMENT k) {
        rechterNachfolger = k;
    }

    public DATENELEMENT suchen(String gesuchtesWort) {
        if(daten.istGleich(gesuchtesWort)) {
            return daten;
        }
        else if(daten.istKleinerAls(gesuchtesWort)) {
            return rechterNachfolger.suchen(gesuchtesWort);
        }
        else {
            return linkerNachfolger.suchen(gesuchtesWort);
        }
    }

    public BAUMELEMENT einfügen(DATENELEMENT neu) {
        if(daten.istGleich(neu)) {
            System.out.println("Datenelement schon vorhanden...!");
        }
        else if(daten.istKleinerAls(neu)) {
            rechterNachfolger = rechterNachfolger.einfügen(neu);
        }
        else {
            linkerNachfolger = linkerNachfolger.einfügen(neu);
        }
        return this;
    }
    
    public void printInOrder() {
        this.linkerNachfolger.printInOrder();
        this.daten.ausgeben();
        this.rechterNachfolger.printInOrder();
    }
    
    public void printPreOrder() {
        this.daten.ausgeben();
        this.linkerNachfolger.printPreOrder();
        this.rechterNachfolger.printPreOrder();
    }
    
    public void printPostOrder() {
        this.linkerNachfolger.printPreOrder();
        this.rechterNachfolger.printPreOrder();
        this.daten.ausgeben();
    }
}
