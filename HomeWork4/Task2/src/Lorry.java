public class Lorry extends Car {
    private double liftingCapacity;

    public Lorry(double liftingCapacity, String brand, String klass, double weight, int enginePower, String engineManufacturen) {
        super(brand, klass, weight, enginePower, engineManufacturen);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        super.autoInfo();
        System.out.println("Грузоподъёмность " + liftingCapacity);
        super.engineInfo();
    }
}
