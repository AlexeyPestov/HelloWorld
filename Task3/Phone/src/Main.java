public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+818319239", "Nokia", 89.6);
        Phone phone2 = new Phone("+0936830", "iPhone", 189.6);
        Phone phone3 = new Phone("+35636356", "Sony", 96.9);
        Phone[] phones = new Phone[]{phone, phone2, phone3};
        for (Phone ph : phones) {
            System.out.println("Номер " + ph.getNumber());
            System.out.println("Модель " + ph.getModel());
            System.out.println("Вес " + ph.getWeight());
            System.out.println("*****************");
        }
        phone.receiveCall("Петя");
        phone2.receiveCall("Леша");
        phone3.receiveCall("Геннадий");
        phone.receiveCall("Андрей" , "8792357");
        phone2.receiveCall("Леша", "9823948");
        phone3.receiveCall("Геннадий", "8923749174");
        phone.sendMessage(new String[] {"812794714", "9732497149","7132784981"});
    }
}
