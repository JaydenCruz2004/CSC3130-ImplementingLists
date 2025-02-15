public class SLList<T> {

    private SLNode<T> head;

    public SLList() {
        this.head = null;
    }

    public SLList(SLNode<T> head) {
        this.head = head;
    }

    public void addy(T item) {
        SLNode<T> newNode = new SLNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            SLNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid position"+ pos) ;
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNode<T> current = head;
        SLNode<T> prev = null;
        int index = 0;

        while (current != null && index < pos) {
            prev = current;
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds" + pos);
            return;
        }

        prev.next = current.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SLNode<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SLList<Object> list = new SLList<>();

        System.out.println("Empty SLList:" + list.toString());

        Object song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Object song2 = new Song("505", "Arctic Monkeys", 4.14);
        Object song3 = new Song("NADIE", "Tito Double P", 3.17);
        Object song4 = new Song("DtMF", "Bad Bunny", 3.57);

        list.addy(song1);
        list.addy(song2);
        list.addy(song3);
        list.addy(song4);

        System.out.println("Songs SLList:");
        System.out.println(list.toString());

        list.removy(3);
        list.removy(1);
        System.out.println("Songs SLList after removing song @ index 3 then 1:");
        System.out.println(list.toString());
    }
}
