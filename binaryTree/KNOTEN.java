public class KNOTEN extends ELEMENT {
    private ELEMENT linkerNachfolger, rechterNachfolger;
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

    public ELEMENT getLinkerNachfolger() {
        return linkerNachfolger;
    }

    public void setLinkerNachfolger(ELEMENT k) {
        linkerNachfolger = k;
    }

    public ELEMENT getRechterNachfolger() {
        return rechterNachfolger;
    }

    public void setRechterNachfolger(ELEMENT k) {
        rechterNachfolger = k;
    }

    public DATENELEMENT suchen(String gesuchtesWort) {
        if(daten.istGleich(gesuchtesWort)) {
            return this.daten;
        } else if(daten.istKleinerAls(gesuchtesWort)) {
            return this.rechterNachfolger.suchen(gesuchtesWort);
        } else if(daten.istGrößerAls(gesuchtesWort)) {
            return this.linkerNachfolger.suchen(gesuchtesWort);
        } 
        return null;
    }

    public ELEMENT einfügen(DATENELEMENT d) {
        if(d.istGrößerAls(this.daten)) {
            this.rechterNachfolger = rechterNachfolger.einfügen(d);
        } else if(d.istKleinerAls(this.daten)) {
            this.linkerNachfolger = linkerNachfolger.einfügen(d);
        } else {
            System.out.println("Already in binary tree");
        }
        return this;
    }

    public int getGröße() {
        return linkerNachfolger.getGröße() + rechterNachfolger.getGröße() + 1;
    }

    public int getTiefe(DATENELEMENT d) {
        if(d == this.getDaten()) {
            return 1;
        } else {
            if(d.istGrößerAls(this.daten)) {
                return this.rechterNachfolger.getTiefe(d) + 1;
            } else {
                return this.linkerNachfolger.getTiefe(d) + 1;
            }
        }
    }
}
