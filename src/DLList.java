public class DLList<T> {
    private DLNode<T> head;
    private DLNode<T> tail;

    public DLList() {
        this.head = null;
        this.tail = null;

    }

    public DLList(DLNode<T> head, DLNode<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public void addy(T data) {
        DLNode<T> newNode = new DLNode<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid position: " + pos);
            return;
        }

        DLNode<T> current = head;
        int index = 0;

        while (current != null && index < pos) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds: " + pos);
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DLList<Song> list = new DLList<>();

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
