public class Main {
    public static void main(String[] args) {
        Song song = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song one = new Song("505", "Artic Monkeys", 4.14);
        System.out.println(song.toString());
        System.out.println(one.toString());

        //System.out.println("songName: "  +song.getTitle() + ", artist: " + song.getArtist() + ", length: " + song.getLength());
        //System.out.println("songName: " + one.getTitle() + ", artist: " + one.getArtist() + ", length: " + one.getLength());
        //System.out.println("Hello, World!");
    }
}