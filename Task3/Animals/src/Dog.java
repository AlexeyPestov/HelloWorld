public class Dog extends Animal {
    private int barkingVolume;

    public Dog(String food, String location, int barkingVolume) {
        super(food, location);
        this.barkingVolume = barkingVolume;
    }

    @Override
    public void eat()   {
        System.out.println("Собака ест " + this.getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }
    @Override
    public void makeNoise() {
        System.out.println("Собака спит");
    }

}
