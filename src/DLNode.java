public class DLNode<T> {
    T data;
    DLNode<T> next;
    DLNode<T> prev;



    public DLNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
