public class KUNSTWERK {
    private String name;
    private String artist;

    public KUNSTWERK(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
