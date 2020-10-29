package Collections;

public class CollectionLink<T> implements CustomCollection<T> {
    private int size = 0;
    private ElemLink <T> startCol;
    private ElemLink <T> endCol;

    @Override
    public void add(T data) {
        ElemLink <T> newElem = new ElemLink<>(null,data,null);
        if (startCol == null)   {
            startCol = newElem;
        }
        else    {
            startCol.setNext(newElem);
            newElem.setPrev(startCol);
        }
        endCol = newElem;
        size++;
    }

    @Override
    public void remove(int index) {
        ElemLink el = get(index);
        removeSearchElement(el);
    }

    public ElemLink get(int index)  {
        int i = 0;
        ElemLink curElem = startCol;
        while (curElem != null)   {
            if (i == index) {
                return curElem;
            }
            curElem = curElem.getNext();
            i++;
        }
        return null;
    }

    @Override
    public void remove(T elem) {
        ElemLink curElem = startCol;
        while (curElem != null) {
            if (curElem.getContent() == elem)   {
                break;
            }
            curElem = curElem.getNext();
        }
        removeSearchElement(curElem);
    }

    private void removeSearchElement (ElemLink el)  {
        try {
            if (el == null) {
                throw new Exception("Element not found");
            }
            ElemLink elPrev = el.getPrev();
            ElemLink elNext = el.getNext();
            if (elPrev != null) {
                elPrev.setNext(elNext);
            }
            if (elNext != null) {
                elNext.setPrev(elPrev);
            }
            el = null;
            size--;
        }
        catch (Exception ex)    {
            ex.printStackTrace();
        }
    }


    @Override
    public int count()  {
        return size;
    }

    @Override
    public void clear() {
        ElemLink elCur = startCol;
        while (elCur != null)   {
            ElemLink next = elCur.getNext();
            elCur = null;
            elCur = next;
        }
        size = 0;
    }
}