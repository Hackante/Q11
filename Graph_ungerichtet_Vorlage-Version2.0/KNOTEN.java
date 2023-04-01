
public class KNOTEN
{
    private String bezeichnung;


    /**
     * Konstruktor für Objekte der Klasse KNOTEN
     */
    public KNOTEN(String neuerWert)
    {
        bezeichnung = neuerWert;
    }


    /**
     * Gibt den Bezeichner des Knotenobjekts zurück
     
     */
    public String BezeichnungGeben()
    {
        return bezeichnung;
    }
}