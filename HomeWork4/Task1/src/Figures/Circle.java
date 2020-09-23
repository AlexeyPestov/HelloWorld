package Figures;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Double square() {
        return Math.PI * Math.pow(radius, 2);
    }

}
