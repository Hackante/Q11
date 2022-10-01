public class PLAYLIST {
    private WARTESCHLANGE songs;
    private MUSIKPLAYER musikplayer;

    public PLAYLIST(KNOTEN anfang) {
        this.musikplayer = new MUSIKPLAYER();
        this.songs = new WARTESCHLANGE(anfang);
    }

    public void starten() {
        SONG song = songs.getAnfang().getSong();
        musikplayer.starten(String.format("%s-%s.mp3", song.getInterpret(), song.getTitle()));
    }

    public void stoppen() {
        musikplayer.stoppen();
    }

    public void hinzufügen(KNOTEN knoten) {
        songs.einfügen(knoten);
    }

    public void skip() {
        musikplayer.stoppen();
        songs.entfernen();
        starten();
    }
}
