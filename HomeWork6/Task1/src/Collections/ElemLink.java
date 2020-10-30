package Collections;

public class ElemLink<T> {
    private ElemLink prev;
    private T content;
    private ElemLink next;

    public ElemLink(ElemLink prev, T content, ElemLink next) {
        this.prev = prev;
        this.content = content;
        this.next = next;
    }

    public void setNext (ElemLink next) {
        this.next = next;
    }

    public void setPrev (ElemLink prev) {
        this.prev = prev;
    }

    public ElemLink getPrev() {
        return prev;
    }

    public T getContent() {
        return content;
    }

    public ElemLink getNext() {
        return next;
    }
}
