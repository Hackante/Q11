public class Taxistand {
    private int anzahl;
    private Taxi[] warteschlange;

    public Taxistand(int Anzahl, Taxi... taxis) {
        this.anzahl = Anzahl;
        this.warteschlange = new Taxi[this.anzahl];
        for (Taxi t : taxis) {
            anstellen(t);
        }

    }

    int getAnzahl() {
        return this.anzahl;
    }
    
    int getTaxiAmount() {
        int i = 0;
        while(warteschlange[i] != null && i < warteschlange.length) {
            i++;
        }
        return i;
    }

    void anstellen(Taxi t) {
        int x = 0;
        while (warteschlange[x] != null && x < warteschlange.length) {
            x++;
        }
        if (warteschlange.length <= x) {
            return;
        }
        warteschlange[x] = t;
    }

    Taxi abfahren() {
        Taxi t = warteschlange[0];
        for (int i = 0; i < (this.warteschlange.length - 1); i++) {
            if(warteschlange[i] == null) break;
            warteschlange[i] = warteschlange[i + 1];
        }
        return t;
    }
}
