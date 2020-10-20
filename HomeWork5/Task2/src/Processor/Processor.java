package Processor;

public class Processor {

    double clockFrequency;
    int countCore;
    double cashMemory;
    String name;
    String manufacturer;

    public Processor() {
    }

    public Processor(double clockFrequency, int countCore, double cashMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.countCore = countCore;
        this.cashMemory = cashMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
