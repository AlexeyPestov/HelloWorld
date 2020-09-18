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

    public static boolean compare (Box box1, Box box2)  {
        return box1.getWeight() == box2.getWeight();
    }

    public static void shifting (Box box1, Box box2)    {
        ArrayList<Fruit> fruitBox1 = box1.getFruitsBox();
        ArrayList<Fruit> fruitBox2 = box2.getFruitsBox();
        String classBox1 = classBox(box1);
        String classBox2 = classBox(box2);

        if (fruitBox1 == null)  {
            System.out.println("Коробка 1 пустая");
            return;
        }
        if (fruitBox2 == null)  {
            System.out.println("Коробка 2 пустая");
            return;
        }
        if(!classBox1.equals(classBox2))    {
            System.out.println("В коробке 1 не те фрукты, которые можно переложить в коробку 2");
            return;
        }
        fruitBox2.addAll(fruitBox1);
        fruitBox1.clear();
    }

    private static String classBox (Box<Fruit> box)   {
        return box.getFruitsBox().get(0).getClass().getName();
    }
}
