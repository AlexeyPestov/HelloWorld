public class SportCar extends Car {
    private double maxSpeed;

    public SportCar(double maxSpeed, String brand, String klass, double weight, int enginePower, String engineManufacturen) {
        super(brand, klass, weight, enginePower, engineManufacturen);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        super.autoInfo();
        System.out.println("Максимальная скорость " + maxSpeed);
        super.engineInfo();
    }
}
