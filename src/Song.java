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
    public static void main(String[] args) {
        Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song2 = new Song("505", "Arctic Monkeys", 4.14);
        Song song3 = new Song("NADIE", "Tito Double P", 3.17);
        Song song4 = new Song("DtMF", "Bad Bunny", 3.57);

        System.out.println(song1.toString());
        System.out.println(song4.toString());
    }
}
