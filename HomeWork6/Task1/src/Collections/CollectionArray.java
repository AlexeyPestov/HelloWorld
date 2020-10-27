package Collections;

public class CollectionArray <T> implements CustomCollection<T> {
    static int countElem = 20;
    T[] arrayElem = (T[]) new Object[countElem];

    @Override
    public void add (T newElem)    {
        int count = count();
        if (count == countElem)   {
            int i = 0;
            T[] arrayElemCopy = arrayElem;
            countElem *= 2;
            arrayElem = (T[]) new Object[countElem];
            for (T elem : arrayElemCopy)    {
                arrayElem[i] = elem;
                i++;
            }
        }
        arrayElem[count] = newElem;
    }
    @Override
    public void remove(T elem) {
        int i = 0;
        for (T el : arrayElem)  {
            if (el.toString().equals(elem.toString()))  {
                remove(i);
                break;
            }
            i++;
        }
    }

    @Override
    public void remove (int index)  {
        try {
            int count = count();
            T[] arrayElemNew = (T[]) new Object[arrayElem.length - 1];
            if (index >= count) {
                throw new Exception();
            }
            for (int i = 0 ; i < index; i++)    {
                arrayElemNew[i] = arrayElem[i];
            }
            for (int i = index + 1; i < count; i++)   {
                arrayElemNew[i-1] = arrayElem[i];
            }
            arrayElem = arrayElemNew;
        }
        catch (Exception ex)    {
            System.out.println("Collection empty or index delete of element more than collection length");
        }
    }

    @Override
    public int count()  {
        int i;
        for (i = 0; arrayElem[i] != null; i++)  {}
        return i;
    }

    @Override
    public void clear() {
        arrayElem = null;
    }
}