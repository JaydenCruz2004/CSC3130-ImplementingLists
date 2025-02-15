
public class AList {
    private Song[] songs;
    private int size = 0;
    private int capacity = 1;

    public AList() {
        songs = new Song[capacity];
        size = 0;
    }
    //add a song to the Alist if size is reaching capacity calls resize()
    public void addy(Song song) {
        if (size >= capacity) {
            resize();
        }
        songs[size++] = song;
    }
    //remove a song checks if it exist if not throw out of bounds
    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = pos; i < size; i++) {
            songs[i] = songs[i + 1];
        }
        songs[--size] = null;
    }
    //is called when size is >= capacity so were able to add no matter inital capacity
    //creats new array copies things over from new to old double the initial size
    private void resize() {
        Song[] newSongs = new Song[songs.length * 2];
        for (int i = 0; i < size; i++) {
            newSongs[i] = songs[i];
        }
        songs = newSongs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(songs[i].toString()).append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        AList list = new AList();

        System.out.println("Empty AList:"+ list.toString());

        Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song2 = new Song("505", "Arctic Monkeys", 4.14);
        Song song3 = new Song("NADIE", "Tito Double P", 3.17);
        Song song4 = new Song("DtMF", "Bad Bunny", 3.57);

        list.addy(song1);
        list.addy(song2);
        list.addy(song3);
        list.addy(song4);

        System.out.println("Songs AList:");
        System.out.println(list.toString());

        list.removy(3);
        list.removy(1);
        System.out.println("Songs AList after removing song @ index 3 then 1:");
        System.out.println(list.toString());
    }

}
