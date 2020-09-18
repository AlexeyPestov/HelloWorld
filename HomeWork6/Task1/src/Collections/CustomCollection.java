package Collections;

public interface CustomCollection<T> {
    void add (T newElem);
    void remove (int index);
    int count();
    void clear();
}