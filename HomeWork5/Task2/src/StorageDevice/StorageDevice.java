package StorageDevice;

import Types.TypeStorage;

public abstract class StorageDevice {
    protected String manufacturer;
    protected double volumeMemory;
    protected TypeStorage typeStorage;
    protected String formFactor;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
