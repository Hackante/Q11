public class CAMP {
    private ORT ort;
    private BESUCHER[] besucher;
    private int maxBesucher;

    public CAMP(int besucherAnzahl) {
        besucher = new BESUCHER[besucherAnzahl];
        maxBesucher = besucherAnzahl;
    }

    public CAMP(ORT ort, int besucherAnzahl) {
        this.ort = ort;
        besucher = new BESUCHER[besucherAnzahl];
    }

    // Setters
    public void setOrt(ORT ort) {
        this.ort = ort;
    }

    public void setBesucher(BESUCHER[] besucher) {
        this.besucher = besucher;
    }

    // Getters
    public ORT getOrt() {
        return ort;
    }

    public BESUCHER[] getBesucher() {
        return besucher;
    }

    public boolean nachbarplaetzeVerfuegbar(int n) {
        int zusammen = 0;
        for(int i = 0; i < besucher.length; i++) {
            if(zusammen == n) break;
            if(besucher[i] == null) zusammen++;
            else zusammen = 0;
        }
        return zusammen == n;
    }
} 