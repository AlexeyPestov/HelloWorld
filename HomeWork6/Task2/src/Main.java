import Fruits.Apple;
import Fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Box<Orange> box1 = new Box();
        box1.put(orange1);
        box1.put(orange2);
        box1.put(orange3);

        Orange orange7 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Box<Orange> box3 = new Box();
        box3.put(orange7);
        box3.put(orange4);
        box3.put(orange5);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Box<Apple> box2 = new Box();
        box2.put(apple1);
        box2.put(apple2);
        box2.put(apple3);

        System.out.println(box1.compare(box3));
        box1.shifting(box3);

    }
}