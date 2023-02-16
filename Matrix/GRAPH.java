public class GRAPH {
    private int anzahlKnoten = 0;
    private KNOTEN[] knoten;
    private int[][] matrix;
    
    /**
     * @param maxAnzahl Maximale Anzahl der Knoten
     */
    public GRAPH(int maxAnzahl) {
        this.knoten = new KNOTEN[maxAnzahl];
        this.matrix = new int[maxAnzahl][maxAnzahl];
        vorbelegen();
    }
    
    /**
     * Fügt einen Wert an einer bestimmten Stelle ein
     * 
     * @param zeile     Zeile zum Einfügen des Wertes
     * @param spalte    Spalte zum Einfügen des Wertes
     * @param wert      Wert zum Einfügen
     */
    public void kantenEinfügen(int zeile, int spalte, int wert) {
        this.matrix[zeile-1][spalte-1] = wert;
    }
    
    /**
     * Füllt die Matrix mit -1 und 0
     */
    public void vorbelegen() {
        for(int i = 0; i < this.matrix.length;i++) {
           for(int j = 0; j < this.matrix.length; j++) {
               this.matrix[i][j] = -1;
               if(i == j) this.matrix[i][j] = 0;
           }
        }
    }
    
    /**
     * Gibt die Matrix auf der Konsole aus
     */
    public void print() {
       for(int i = 0; i < this.matrix.length;i++) {
           for(int j = 0; j < this.matrix.length; j++) {
               System.out.print(this.matrix[i][j] + " ");
           }
           System.out.println();
        }
    }
    
    /**
     * Fügt einen Knoten ein
     * 
     * @param bezeichner Bezeichner für neuen Knoten zum Einfügen
     */
    public void knotenEinfügen(String bezeichner) {
        for(int i = 0; i < this.knoten.length; i++) {
            if(this.knoten[i] != null && this.knoten[i].getBezeichner() == bezeichner) {
                System.out.println("Knoten mit diesem Bezeichner existiert bereits!");
                break;
            } else if(this.knoten[i] == null) {
                this.knoten[i] = new KNOTEN(bezeichner);
                anzahlKnoten++;
                break;
            }
        }
    }
}
