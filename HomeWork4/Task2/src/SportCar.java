public class SportCar extends Car {
    private Double maxSpeed;

    public SportCar(Double maxSpeed, String brand, String clas, Double weight, Integer enginePower, String engineManufacturen) {
        super(brand, clas, weight, enginePower, engineManufacturen);
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
