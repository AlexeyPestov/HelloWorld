package StorageDevice;

import Types.TypeStorage;

public class StorageDevice {
    protected String manufacturer;
    protected double volumeMemory;
    protected TypeStorage typeStorage;
    protected String formFactor;

    public StorageDevice(String manufacturer, double volumeMemory, TypeStorage typeStorage, String formFactor) {
        this.manufacturer = manufacturer;
        this.volumeMemory = volumeMemory;
        this.typeStorage = typeStorage;
        this.formFactor = formFactor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
