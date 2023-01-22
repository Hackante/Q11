import java.util.ArrayList;
public class PLAYLIST {
    
    private MUSIKPLAYER musikplayer;
    private SONG aktuellerSong;
    private ArrayList<SONG> songs;

    public PLAYLIST()
    {
        songs = new ArrayList<SONG>();
        musikplayer = new MUSIKPLAYER();
    }
    
    public SONG getAktuellerSong() {
        return aktuellerSong;
    }
    
    public void initialisieren() {
        aktuellerSong = songs.get(0);
    }

    public void starten() {
        String interpret = aktuellerSong.getInterpret();
        String titel = aktuellerSong.getTitel();
        String dateiname = interpret + "-" + titel;
        musikplayer.starten(dateiname + ".mp3");
    }

    public void stoppen() {
        musikplayer.stoppen();
    }

    public void nächsterSong() {
        stoppen();
        int index = songs.indexOf(aktuellerSong);
        aktuellerSong = index < songs.size()-1 ? songs.get(index+1) : aktuellerSong;
        starten();
    }
    
    public void hinzufügen(SONG s) {
        songs.add(s);
    }
    
    public void entfernen(SONG s) {
        songs.remove(s);
    }
}