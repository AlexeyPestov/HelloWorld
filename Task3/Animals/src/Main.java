public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Чаппи", "Москва");
        Cat cat = new Cat("Феликс", "Петербург");
        Horse horse = new Horse("Овёс", "Тверь");
        Animal[] animals = new Animal[]{dog, cat, horse};
        Veterinarian vet = new Veterinarian();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
