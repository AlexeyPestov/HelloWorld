package RAM;

import Components.Component;

public class RAM implements Component {

    private String manufacturer;
    private double volumeMemory;
    private double frequency;
    private String typeMemory;

    public RAM(String manufacturer, double volumeMemory, double frequency, String typeMemory) {
        this.manufacturer = manufacturer;
        this.volumeMemory = volumeMemory;
        this.frequency = frequency;
        this.typeMemory = typeMemory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
