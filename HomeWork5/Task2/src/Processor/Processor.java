package Processor;

public abstract class Processor {

    double clockFrequency;
    int countCore;
    double cashMemory;
    String name;
    String manufacturer;

    public double getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getCountCore() {
        return countCore;
    }

    public void setCountCore(int countCore) {
        this.countCore = countCore;
    }

    public double getCashMemory() {
        return cashMemory;
    }

    public void setCashMemory(double cashMemory) {
        this.cashMemory = cashMemory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
