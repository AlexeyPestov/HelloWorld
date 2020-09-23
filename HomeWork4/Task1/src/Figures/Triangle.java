package Figures;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        p = (a + b + c) / 2;
    }

    @Override
    public Double square() {
        if (correctFigure()) {
            return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
        }
        else    {
            return null;
        }
    }

    private boolean correctFigure() {
        if (a >= b + c) {
            return false;
        }
        if (b >= a + c) {
            return false;
        }
        if (c >= a + b) {
            return false;
        }
        return true;
    }
}
