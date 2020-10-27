import java.util.ArrayList;
import Fruits.Fruit;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitsBox = new ArrayList<>();

    public ArrayList<T> getFruitsBox() {
        return fruitsBox;
    }
    public void put (T fruit)   {
        if (fruit.isInBox())    {
            System.out.println("Этот фрукт уже в другой коробке");
            return;
        }
        fruit.setInBox(true);
        fruitsBox.add(fruit);
    }

    public float getWeight()    {
        float weight = 0;
        for (T fruit : fruitsBox)   {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare (Box box2)  {
        return this.getWeight() == box2.getWeight();
    }

    public void shifting (Box box2)    {
        ArrayList fruitBox2 = box2.getFruitsBox();

        if (fruitsBox == null)  {
            System.out.println("Текущая коробка пустая");
            return;
        }
        if (fruitBox2 == null)  {
            System.out.println("Коробка 2 пустая");
            return;
        }
        if(fruitsBox.get(0).getClass().equals(fruitBox2.get(0).getClass())) {
            System.out.println("В коробке 1 не те фрукты, которые можно переложить в коробку 2");
            return;
        }
        fruitBox2.addAll(fruitsBox);
        fruitsBox.clear();
    }
}
