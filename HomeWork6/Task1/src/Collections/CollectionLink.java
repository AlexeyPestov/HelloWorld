package Collections;

import java.util.LinkedList;

public class CollectionLink<T> implements CustomCollection<T> {
    LinkedList<T> list = new LinkedList<>();

    @Override
    public void add(T newElem) {
        list.add(newElem);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public int count() {
        return list.size();
    }

    @Override
    public void clear() {
        list = null;
    }
}