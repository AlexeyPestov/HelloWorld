public class Horse extends Animal {
    public int countHoofs = 4;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat()   {
        System.out.println("Лошадь есть " + this.getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь спит");
    }
}
