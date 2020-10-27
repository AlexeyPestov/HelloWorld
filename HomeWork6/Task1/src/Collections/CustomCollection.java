package Collections;

public interface CustomCollection<T> {
    void add (T newElem);
    void remove (int index);
    void remove (T elem);
    int count();
    void clear();
}