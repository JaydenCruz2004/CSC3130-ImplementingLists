public class SLList {

    private SLNode head;

    public SLList() {
        this.head = null;
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
        SLList list = new SLList();

        System.out.println("Empty SLList:" + list.toString());

        list.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        list.addy(new Song("505", "Arctic Monkeys", 4.14));
        list.addy(new Song("NADIE", "Tito Double P", 3.17));
        list.addy(new Song("DtMF", "Bad Bunny", 3.57));

        System.out.println("Songs SLList:");
        System.out.println(list.toString());

        list.removy(3);
        list.removy(1);
        System.out.println("Songs SLList after removing song @ index 1 and 3:");
        System.out.println(list.toString());
    }
}
