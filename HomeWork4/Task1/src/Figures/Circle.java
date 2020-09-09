package Figures;

public class Circle implements Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double square() {
        return Math.PI * Math.pow(radius, 2);
    }

}
