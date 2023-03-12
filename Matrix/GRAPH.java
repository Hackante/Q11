import java.util.ArrayList;

public class GRAPH {
    private int anzahlKnoten = 0;
    private KNOTEN[] knoten;
    private int[][] matrix;
    
    /**
     * Erstellt einen Graphen mit einer maximalen Knotenanzahl.
     * 
     * @param   maxAnzahl Maximale Anzahl der Knoten
     */
    public GRAPH(int maxAnzahl) {
        this.knoten = new KNOTEN[maxAnzahl];
        this.matrix = new int[maxAnzahl][maxAnzahl];
        vorbelegen();
    }
    
    /**
     * Fügt einen Wert an einer bestimmten Stelle ein.
     * 
     * @param zeile     Zeile zum Einfügen des Wertes
     * @param spalte    Spalte zum Einfügen des Wertes
     * @param wert      Wert zum Einfügen
     */
    public void kantenEinfügen (int zeile, int spalte, int wert) {
        this.matrix[zeile-1][spalte-1] = wert;
    }
    
    /**
     * Füllt die Matrix mit -1 und 0.
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
     * Gibt die Matrix auf der Konsole aus.
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
     * Fügt einen Knoten ein.
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
                this.matrix[i][i] = 0;
                anzahlKnoten++;
                break;
            }
        }
    }

    /**
     * Einfügen einer Kante in den Graphen
     * Eine Kante ist durch einen Anfangsknoten und einen Endknoten festgelegt und hat eine Gewichtung
     * 
     * @param   von         Bezeichner des Anfangsknotens
     * @param   nach         Bezeichner des Endknotens
     * @param   gewichtung  Gewichtung der Kante als Ganzzahl
     */
    public void KanteEinfuegen(String von, String nach, int gewichtung) {
        int vonNummer, nachNummer;
        
        vonNummer = getIndexOf(von);
        nachNummer = getIndexOf(nach);
        if((vonNummer!=-1) && (nachNummer!=-1) && (vonNummer!=nachNummer)) {
            matrix[vonNummer][nachNummer] = gewichtung;
            matrix[nachNummer][vonNummer] = gewichtung;
        }
    } 

    /**
     * Gibt die Anzahl der Knoten des Graphen
     * 
     * @return  Anzahl der Knoten
     */   
    public int KnotenAnzahlgeben() {
        return anzahlKnoten;
    }

    /**
     * Gibt die Gewichtung einer Kante zurück
     * 
     * @param von   Bezeichner des Anfangsknotens
     * @param nach  Bezeichner des Endknotens
     * @return      Gewichtung der Kante oder -1, falls die Kante nicht existiert
     */
    public int getGewichtung(String von, String nach) {
        int vonNummer, nachNummer;
        
        vonNummer = getIndexOf(von);
        nachNummer = getIndexOf(nach);
        if((vonNummer!=-1) && (nachNummer!=-1) && (vonNummer!=nachNummer)) {
            return matrix[vonNummer][nachNummer];
        }
        return -1;
    }
    
    /**
     * Findet alle Knoten mit Grad = 1.
     * 
     * @return ArrayList mit allen Knoten, die nur eine Kante haben
     */
    public ArrayList<KNOTEN> findeKnoten() {
        ArrayList<KNOTEN> knotenList = new ArrayList<KNOTEN>();
        /* Old version:
        for(int i = 0; i < anzahlKnoten; i++) {
            // true if there is already a 1 in the row
            boolean c = false;
            for(int j = 0; j < anzahlKnoten; j++) {
                if(this.matrix[i][j] > 1) {
                    if(c) {
                        c = false;
                        break;
                    } else {
                        c = true;
                    }
                }
            }
            if(c) knotenList.add(this.knoten[i]);
            c = false;
        }
        
        // ArrayList mit allen Knoten die nur eine 1 haben
        return knotenList;
        */
        for(int i = 0; i < this.anzahlKnoten; i++) {
            if(this.getKnotenGrad(this.getBezeichnerOf(i)) == 1) {
                knotenList.add(this.knoten[i]);
            }
        }
        return knotenList;
    }
    
    /**
     * Gibt den Grad des Knotens zurück oder -1, falls der Knoten nicht gefunden wird.
     * 
     * @param bezeichner    Bezeichner des Knotens
     * @return              Grad des Knotens oder -1
     */
    public int getKnotenGrad(String bezeichner) {
        int knoten = getIndexOf(bezeichner);
        if(knoten == -1) return -1;
        int grad = 0;
        for(int i = 0; i < this.anzahlKnoten; i++) {
            if(this.matrix[knoten][i] > 0) grad++;
        }
        return grad;
    }
    
    /**
     * Schaut ob alle Knoten einen gerade Grad haben.
     * 
     * @return Ob eulersch
     */
    public boolean istEulersch() {
        for(int i = 0; i < this.anzahlKnoten; i++) {
            if(this.getKnotenGrad(getBezeichnerOf(i)) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Konvertier einen Bezeichner zum Index.
     * 
     * @param bezeichner    Bezeichner des Knotens
     * @return              Index des Knotens
     */
    public int getIndexOf(String bezeichner) {
        for(int i = 0; i < this.anzahlKnoten; i++) {
            if(knoten[i].getBezeichner() == bezeichner) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Konvertiert einen Index zum Bezeichner.
     * 
     * @param i Index des Knotens
     * @return  Bezeichner des Knotens
     */
    public String getBezeichnerOf(int i) {
        return this.knoten[i].getBezeichner();
    }
    
    /**
     * Gibt aus, ob es sich um einen regulären Graphen handelt.
     * @return Ob regulär
     */
    public boolean istRegulär() {
        int n = getKnotenGrad(knoten[0].getBezeichner());
        for(int i = 1; i < anzahlKnoten; i++) {
            if(n != getKnotenGrad(knoten[i].getBezeichner())) return false;
        }
        return true;
    }
}
