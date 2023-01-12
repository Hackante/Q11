public class WÖRTERBUCH {
    private BINÄRBAUM binärbaum;
    
    public WÖRTERBUCH() {
        binärbaum = new BINÄRBAUM();
        
        WÖRTERBUCHEINTRAG w1 = new WÖRTERBUCHEINTRAG("car","Auto");
        WÖRTERBUCHEINTRAG w2 = new WÖRTERBUCHEINTRAG("bike","Wait till you see me on my bike");
        WÖRTERBUCHEINTRAG w3 = new WÖRTERBUCHEINTRAG("day","At some point during the day it's HIIIIGGGHHH NNOOOOOOON!");
        WÖRTERBUCHEINTRAG w4 = new WÖRTERBUCHEINTRAG("suffer", "Suffer as I have");
        WÖRTERBUCHEINTRAG w5 = new WÖRTERBUCHEINTRAG("heroes", "Heroes NEVER DIE");
        WÖRTERBUCHEINTRAG w6 = new WÖRTERBUCHEINTRAG("kitsune", "LET THE KITSUNE GUIDE YOUUUUU!!");
        
        binärbaum.einfügen(w1);
        binärbaum.einfügen(w2);
        binärbaum.einfügen(w3);
        binärbaum.einfügen(w4);
        binärbaum.einfügen(w5);
        binärbaum.einfügen(w6);
    }
    
    public DATENELEMENT suchen(String gesuchtesWort) {
        return binärbaum.suchen(gesuchtesWort);
    }
}
