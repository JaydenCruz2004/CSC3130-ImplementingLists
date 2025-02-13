public class Song {
    String title;
    String artist;
    double length;

    //Constructor with params
    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
    //Constructor
    public Song(){

    }

    public String toString() {
        return "songName: " + title + ", artist: " + artist + ", length: " + length;
    }

    //Getters
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;

    }
    public double getLength() {
        return length;
    }
    //Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setLength(double length) {
        this.length = length;
    }
}
