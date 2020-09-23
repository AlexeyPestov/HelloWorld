import Figures.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(2.0, 1.1, 5.2);
        shape[1] = new Circle(7.5);
        shape[2] = new Rectangle(7.1, 4.5);
        for (Shape sh: shape){
            System.out.println("Площадь фигуры: "+sh.square());
        }

    }
}
