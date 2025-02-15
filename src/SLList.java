public class SLList {

    private SLNode head;

    public SLList() {
        this.head = null;
    }

    public SLList(SLNode head) {
        this.head = head;
    }

    public void addy(Song s) {
        SLNode newNode = new SLNode(s);
        if (head == null) {
            head = newNode;
        } else {
            SLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNode current = head;
        SLNode prev = null;
        int index = 0;

        while (current != null && index < pos) {
            prev = current;
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        prev.next = current.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SLNode current = head;
        while (current != null) {
            sb.append(current.song.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DLList list = new DLList();

        System.out.println("Empty DLList:" + list.toString());

        Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song2 = new Song("505", "Arctic Monkeys", 4.14);
        Song song3 = new Song("NADIE", "Tito Double P", 3.17);
        Song song4 = new Song("DtMF", "Bad Bunny", 3.57);

        list.addy(song1);
        list.addy(song2);
        list.addy(song3);
        list.addy(song4);

        System.out.println("Songs DLList:");
        System.out.println(list.toString());

        list.removy(3);
        list.removy(1);
        System.out.println("Songs DLList after removing song @ index 3 then 1:");
        System.out.println(list.toString());
    }
}
