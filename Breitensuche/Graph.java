import java.util.ArrayList;

public class Graph {
    private int[][] adjMatrix;
    private int anzahlKnoten;
    private Knoten[] knoten;

    public Graph(int maxAnzahl) {
        adjMatrix = new int[maxAnzahl][maxAnzahl];
        anzahlKnoten = 0;
        knoten = new Knoten[maxAnzahl];
        vorbelegen();
    }

    private void vorbelegen() {
        for (int i = 0; i < anzahlKnoten; i++) {
            for (int j = 0; j < anzahlKnoten; j++) {
                if(i == j) adjMatrix[i][j] = 0;
                else adjMatrix[i][j] = -1;
            }
        }
    }

    public Knoten knotenEinfuegen(Knoten k) {
        knoten[anzahlKnoten] = k;
        anzahlKnoten++;
        return k;
    }

    public Knoten KnotenEinfuegen(String name) {
        return knotenEinfuegen(new Knoten(name));
    }

    public void KanteEinfuegen(int s1, int s2) {
        Knoten k1 = getKnoten(s1);
        Knoten k2 = getKnoten(s2);
        kanteEinfuegen(k1, k2, 1);
    }

    public void kanteEinfuegen(Knoten k1, Knoten k2, int gewicht) {
        int i = getIndex(k1);
        int j = getIndex(k2);
        kanteEinfuegen(i, j, gewicht);
    }

    public void kanteEinfuegen(int i, int j) {
        kanteEinfuegen(i, j, 1);
    }

    public void kanteEinfuegen(int i, int j, int gewicht) {
        adjMatrix[i][j] = gewicht;
    }

    public void kanteEntfernen(Knoten k1, Knoten k2) {
        int i = getIndex(k1);
        int j = getIndex(k2);
        adjMatrix[i][j] = -1;
    }

    public void kanteEntfernen(int i, int j) {
        adjMatrix[i][j] = -1;
    }

    public int getIndex(Knoten k) {
        for (int i = 0; i < anzahlKnoten; i++) {
            if(knoten[i].equals(k)) return i;
        }
        return -1;
    }

    public Knoten getKnoten(int i) {
        return knoten[i];
    }

    public void print() {
        System.out.print("  ");
        for (int i = 0; i < anzahlKnoten; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < anzahlKnoten; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < anzahlKnoten; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[] Breitensuche(int startIndex) {
        boolean[] besucht = new boolean[anzahlKnoten];
        ArrayList<Integer> queue = new ArrayList<Integer>();
        int[] ergebnis = new int[anzahlKnoten];
        int iteration = 0;
        queue.add(startIndex);
        besucht[startIndex] = true;
        while(!queue.isEmpty()) {
            int aktuellerKnoten = queue.remove(0);
            System.out.println("Knoten " + aktuellerKnoten + " besucht");
            for (int i = 0; i < anzahlKnoten; i++) {
                if(adjMatrix[aktuellerKnoten][i] > 0 && !besucht[i]) {
                    queue.add(i);
                    besucht[i] = true;
                }
            }
            ergebnis[iteration] = aktuellerKnoten;
            iteration++;
        }
        return ergebnis;
    }
}
