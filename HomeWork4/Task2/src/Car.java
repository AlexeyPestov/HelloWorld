public abstract class Car {
    private String brand;
    private String clas;
    private Double weight;
    private Engine engine;

    public Car(String brand, String clas, Double weight, Integer enginePower, String engineManufacturen) {
        this.brand = brand;
        this.clas = clas;
        this.weight = weight;
        this.engine = new Engine(enginePower, engineManufacturen);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public String getBrand() {
        return brand;
    }

    public String getClas() {
        return clas;
    }

    public Double getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void autoInfo()  {
        System.out.println("Информация о автомобиле:");
        System.out.println("Марка " + brand);
        System.out.println("Класс " + clas);
        System.out.println("Вес " + weight);
    }

    public void engineInfo()    {
        System.out.println("Информация о двигателе:");
        System.out.println("Мощность " + engine.getPower());
        System.out.println("Производитель " + engine.getManufacturer());
    }
}
