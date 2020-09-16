public class Cat extends Animal {
    private int purVolume;

    public Cat(String food, String location, int purVolume) {
        super(food, location);
        this.purVolume = purVolume;
    }

    @Override
    public void eat()   {
        System.out.println("Кошка ест " + this.getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка спит");
    }

}
