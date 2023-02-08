public class WÖRTERBUCH {
    private BINÄRBAUM binärbaum;
    
    public WÖRTERBUCH() {
        binärbaum = new BINÄRBAUM();
        
        WÖRTERBUCHEINTRAG w1 = new WÖRTERBUCHEINTRAG("car","Auto");
        WÖRTERBUCHEINTRAG w2 = new WÖRTERBUCHEINTRAG("cake","Kuchen");
        WÖRTERBUCHEINTRAG w3 = new WÖRTERBUCHEINTRAG("coin","Münze");
        
        KNOTEN k1 = new KNOTEN(w1);
        KNOTEN k2 = new KNOTEN(w2);
        KNOTEN k3 = new KNOTEN(w3);
        
        binärbaum.setWurzel(k1);
        k1.setLinkerNachfolger(k2);
        k1.setRechterNachfolger(k3);
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        return binärbaum.suchen(gesuchtesWort);
    }
    
    public void einfügen(DATENELEMENT neu) {
        binärbaum.einfügen(neu);
    }
}
