public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new SportCar(700.0,"Audi","A",1200.0,786, "BMW");
        cars[1] = new Lorry(2220.0, "Man", "B", 19823.0, 120,"BMW");
        for (Car car : cars)    {
            car.printInfo();
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
        }
    }
}