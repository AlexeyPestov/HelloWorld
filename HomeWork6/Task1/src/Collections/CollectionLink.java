package Collections;

public class CollectionLink<T> implements CustomCollection<T> {
    static int countElem = 1;
    ElemLink<T>[] arrayElem = new ElemLink [countElem];

    @Override
    public void add(T newElem) {
        int i = count();
        if (i == countElem) {
            countElem *= 2;
            ElemLink<T>[] newArray = new ElemLink[countElem];
            int j = 0;
            for (ElemLink el : arrayElem)   {
                newArray[j] = el;
                j++;
            }
            arrayElem = newArray;

        }
        if (i == 0) {
            arrayElem[i] = new ElemLink<>(null,newElem,null);
        }
        else {
            arrayElem[i] = new ElemLink<T>(arrayElem[i - 1], newElem, null);
            arrayElem[i - 1].setNext(arrayElem[i]);
        }
    }

    @Override
    public void remove(int index) {
        int end = count() - 1;
        ElemLink el = get(index);
        ElemLink elPrev = el.getPrev();
        ElemLink elNext = el.getNext();
        if (elNext != null) {
            elNext.setPrev(elPrev);
        }
        if (elPrev != null) {
            elPrev.setNext(elNext);
        }
        ElemLink<T>[] newArray = new ElemLink[countElem];
        for (int i = 0; i < index; i++) {
            newArray[i] = arrayElem[i];
        }
        for (int i = index; i < end; i++)  {
            newArray[i] = arrayElem[i+1];
        }
        arrayElem = newArray;

    }

    public ElemLink get(int index)  {
        int i = 0;
        for (ElemLink el : arrayElem)   {
            if (i == index) {
                return el;
            }
            i++;
        }
        return null;
    }

    @Override
    public void remove(T elem) {
        int i = 0;
        for (ElemLink el : arrayElem)   {
            if (el == elem) {
                remove(i);
                break;
            }
            i++;
        }
    }


    @Override
    public int count()  {
        int i = 0;
        while ( i < countElem)  {
            if (arrayElem[i] == null) {
                return i;
            }
            i++;
        }
        return i;
    }

    @Override
    public void clear() {
        arrayElem = null;
    }

}