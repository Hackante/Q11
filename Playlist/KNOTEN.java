public class KNOTEN {
    private SONG song;
    private KNOTEN nachfolger;

    public KNOTEN(SONG song) {
        this.song = song;
    }

    public KNOTEN getNachfolger() {
        return this.nachfolger;
    }

    public void setNachfolger(KNOTEN nachfolger) {
        this.nachfolger = nachfolger;
    }

    public SONG getSong() {
        return this.song;
    }
}
