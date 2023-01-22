
/**
 * Beschreiben Sie hier die Klasse PLAYLIST.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PLAYLIST
{
    private WARTESCHLANGE songs;
    private MUSIKPLAYER musikplayer;

    /**
     * Konstruktor für Objekte der Klasse PLAYLIST
     */
    public PLAYLIST()
    {
        songs = new WARTESCHLANGE();
        musikplayer = new MUSIKPLAYER();
    }

    public void starten() {
        SONG song = (SONG) songs.entfernen().getDaten();
        String dateiname = song.getInterpret() + "-" + song.getTitel();
        musikplayer.starten(dateiname + ".mp3");
    }

    public void stoppen() {
        musikplayer.stoppen();
    }

    public void hinzufügen(KNOTEN k) {
        songs.einfügen(k);
    }
 
}