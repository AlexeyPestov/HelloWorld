public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, Double weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(String[] numbers) {
        System.out.println("Сообщения отправятся");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
