public class PLAYLIST
{
    private WARTESCHLANGE songs;
    private MUSIKPLAYER musikplayer;

    public PLAYLIST()
    {
        songs = new WARTESCHLANGE();
        musikplayer = new MUSIKPLAYER();
    }

    public void starten() {
        SONG song = (SONG) songs.entfernen().getDaten();
        if(song == null) return;
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