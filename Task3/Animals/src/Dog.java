public class Dog extends Animal {
    private int barkingVolume;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat()   {
        System.out.println("Собака ест " + this.getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака спит");
    }

}
