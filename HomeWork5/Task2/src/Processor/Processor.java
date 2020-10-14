package Processor;

import Computers.Computer;
import Computers.HomeComputer;

public abstract class Processor {

    double clockFrequency;
    int countCore;
    double cashMemory;
    String name;
    String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
