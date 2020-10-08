public class Calculator {
    private int a;
    private int b;
    private Logger logger;
    private String message;

    public Calculator(int a, int b, Logger logger) {
        this.a = a;
        this.b = b;
        this.logger = logger;
        sum();
        substraction();
        multiplication();
        division();
    }

    public void sum() {
        int result = a + b;
        message = a + " + " + b + " = " + result;
        logger.get(message);
    }

    public void substraction() {
        int result = a - b;
        message = a + " - " + b + " = " + result;
        logger.get(message);
    }

    public void multiplication() {
        int result = a * b;
        message = a + " * " + b + " = " + result;
        logger.get(message);
    }

    public void division() {
        double result = (double) a / (double) b;
        message = a + " * " + b + " = " + result;
        logger.get(message);
    }
}
