public class Horse extends Animal {
    private final int countHoofs = 4;
    private int neighVolume;

    public Horse(String food, String location, int neighVolume) {
        super(food, location);
        this.neighVolume = neighVolume;
    }

    @Override
    public void eat()   {
        System.out.println("Лошадь есть " + this.getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь спит");
    }
}
