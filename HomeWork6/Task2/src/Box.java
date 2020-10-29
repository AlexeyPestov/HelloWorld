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

    public void shifting (Box <T> box2)    {
        ArrayList fruitBox2 = box2.getFruitsBox();

        if (fruitsBox == null)  {
            System.out.println("Текущая коробка пустая");
            return;
        }
        if (fruitBox2 == null)  {
            System.out.println("Коробка 2 пустая");
            return;
        }
        fruitBox2.addAll(fruitsBox);
        fruitsBox.clear();
    }
}
