public class Cat extends Animal {
    private int purVolume;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat()   {
        System.out.println("Кошка ест " + this.getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка спит");
    }

}
