package Processor;

import Components.Component;

public class Processor implements Component {

    private double clockFrequency;
    private int countCore;
    private double cashMemory;
    private String name;
    private String manufacturer;

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
