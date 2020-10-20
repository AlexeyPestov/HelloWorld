package RAM;

public class RAM {

    protected String manufacturer;
    protected double volumeMemory;
    protected double frequency;
    protected String typeMemory;

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
