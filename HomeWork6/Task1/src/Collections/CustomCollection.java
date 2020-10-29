package Collections;

public interface CustomCollection<T> {
    void add (T newElem);
    void remove (int index) throws Exception;
    void remove (T elem);
    int count();
    void clear();
}