package Collections;

public class CollectionArray <T> implements CustomCollection<T> {
    T[] arrayElem;

    @Override
    public void add (T newElem)    {
        if (arrayElem == null)  {
            arrayElem = (T[])new Object[1];
            arrayElem[0] = newElem;
        }
        else {
            T[] arrayElemNew = (T[]) new Object[arrayElem.length + 1];
            for (int i = 0; i < arrayElem.length; i++) {
                arrayElemNew[i] = arrayElem[i];
            }
            arrayElemNew[arrayElem.length] = newElem;
            arrayElem = arrayElemNew;
        }
    }

    @Override
    public void remove (int index)  {
        try {
            T[] arrayElemNew = (T[]) new Object[arrayElem.length - 1];
            for (int i = 0 ; i < index; i++)    {
                arrayElemNew[i] = arrayElem[i];
            }
            for (int i = index + 1; i < arrayElem.length; i++)   {
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
        return arrayElem.length;
    }

    @Override
    public void clear() {
        arrayElem = null;
    }
}