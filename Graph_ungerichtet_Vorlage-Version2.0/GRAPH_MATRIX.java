
public class GRAPH_MATRIX
{
    // aktuelle Knotenanzahl
    private int anzahlKnoten;
    
    // Feld der Knoten des Graphen
    private KNOTEN[] knoten;   

    // 2-dim Feld der Adjazenzmatrix
    private int[][] matrix;


    /**
     * Konstruktor für Objekte der Klasse GRAPH_MATRIX
     * Die maximale Anzahl der Knoten wird dabei festgelegt
     *      
     * @param   maximaleKnoten   Anzahl der maximal möglichen Knoten
     * 
     */
    public GRAPH_MATRIX(int maximaleKnoten)
    {
        anzahlKnoten = 0;
        knoten = new KNOTEN[maximaleKnoten];
        matrix = new int[maximaleKnoten][maximaleKnoten];
    }

    
    /**
     * Einfügen eines neuen Knoten in den Graphen
     * Wenn die maximale Anzahl an Knoten erreicht wird, dann erfolgt kein Einfügen
     * 
     * @param   bezeichner   Bezeichner des neuen Knotens, der dem Graphen hinzugefügt wird.
     * 
     */
    public void KnotenEinfuegen(String bezeichner)
    {
        if ((anzahlKnoten < knoten.length) && (KnotenNummer(bezeichner) == -1))
        {
            knoten[anzahlKnoten] = new KNOTEN(bezeichner);
            matrix[anzahlKnoten][anzahlKnoten] = 0;
            for (int i=0; i<anzahlKnoten; i++)
            {
                // Symmetrie, da ungerichteter Graph
                matrix[anzahlKnoten][i] = -1;
                matrix[i][anzahlKnoten] = -1;
            }
            anzahlKnoten = anzahlKnoten + 1;
        }
    }

    
    /**
     * Gibt die interne Nummer des Knoten
     * Wenn ein Knoten mit diesem Bezeichner nicht bekannt ist wird -1 zurückgegeben
     * 
     * @param   bezeichner   Bezeichner des Knoten der gesucht wird
     * @return  Indexnummer des Knotens im Knotenarray; 0<= x <= anzahl-1 bzw. -1
     * 
     */   
    private int KnotenNummer(String bezeichner)
    {
        int i, ergeb;
        
        ergeb = -1;
        for (i=0; (i < anzahlKnoten) && (ergeb == -1); i++)
            if (knoten[i].BezeichnungGeben().equals(bezeichner))
                ergeb = i;
        
        return ergeb;
    }
    

    /**
     * Gibt die Bezeichnung eines Knotens mit der internen Knotennummer
     * 
     * @param    Indexnummer des Knotens im Knotenarray; 0<= x <= anzahl-1
     * @return   bezeichner  Bezeichner des Knoten
     * 
     */   
    public String KnotenBezeichnerGeben(int knotenNummer)
    {
        if ((knotenNummer < anzahlKnoten) && (knotenNummer >= 0))
            return knoten[knotenNummer].BezeichnungGeben();
        else
            return "";
    }

    
    /**
     * Einfügen einer Kante in den Graphen
     * Eine Kante ist durch einen Anfangsknoten und einen Endknoten festgelegt und hat eine Gewichtung
     * 
     * @param   von         Bezeichner des Anfangsknotens
     * @param   nach         Bezeichner des Endknotens
     * @param   gewichtung  Gewichtung der Kante als Ganzzahl
     * 
     */
    public void KanteEinfuegen(String von, String nach, int gewichtung)
    {
        int vonNummer, nachNummer;
        
        vonNummer = KnotenNummer(von);
        nachNummer = KnotenNummer(nach);
        if ((vonNummer!=-1) && (nachNummer!=-1) && (vonNummer!=nachNummer))
        {
            matrix[vonNummer][nachNummer] = gewichtung;
            matrix[nachNummer][vonNummer] = gewichtung;
        }
    }


   
    /**
     * Gibt die Anzahl der Knoten des Graphen
     * 
     * @return  Anzahl der Knoten
     * 
     */   
    int KnotenAnzahlgeben()
    {
        return anzahlKnoten;
    }
    
    
    /**
     * Gibt die Gewichtung einer Kante
     * Die Kante ist durch einen Anfangsknoten und einen Endknoten festgelegt
     * 
     * @param   von         Bezeichner des Anfangsknotens
     * @param   nach         Bezeichner des Endknotens
     * @return  Gewichtung der Kante
     * 
     */   
    int KanteGewichtGeben(String von, String nach)
    {
        int vonNummer, nachNummer;
        
        vonNummer = KnotenNummer(von);
        nachNummer = KnotenNummer(nach);
        if ((vonNummer!=-1) && (nachNummer!=-1))
            return matrix[vonNummer][nachNummer];
        else
            return -1;
    }
      /**
     * Gibt den Grad eines Knotes zurück
     * 
     * @param   bezeichnung      Bezeichner des Knotens dessen Grad gesucht ist
     * @return  Grad des Knotens
     *
     */
    int KnotenGradGeben(String bezeichnung){
        int knotenNummer, grad;
        grad = 0;
        
        knotenNummer = KnotenNummer(bezeichnung);
        for(int i=0; i< anzahlKnoten; i++){
            if(matrix[knotenNummer][i] > 0){
                grad = grad +1;
            }
        }
        return grad;
    }
    
    /**
     * Testet ob jeder Knoten geraden Grad hat
     * 
     * @return boolean Wahrheitswert, der angibt ob jeder Knoten geraden Grad hat
     * 
     */
    boolean IstEulersch(){
        
        boolean jederKnotenGeradenGrad = true;
        
        for(int i=0; i< anzahlKnoten; i++){
            String bezeichnung = KnotenBezeichnerGeben(i);
            
            if (KnotenGradGeben(bezeichnung) % 2 != 0)
                jederKnotenGeradenGrad = false;
        }
        return jederKnotenGeradenGrad;
    }
}
