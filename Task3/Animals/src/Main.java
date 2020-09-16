public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Чаппи", "Москва", 100);
        Cat cat = new Cat("Феликс", "Петербург", 200);
        Horse horse = new Horse("Овёс", "Тверь", 600);
        Animal[] animals = new Animal[]{dog, cat, horse};
        Veterinarian vet = new Veterinarian();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
