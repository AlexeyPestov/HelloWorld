package StorageDevice;

import Components.Component;
import Types.StorageType;

public class StorageDevice implements Component {
    private String manufacturer;
    private double volumeMemory;
    private StorageType storageType;
    private String formFactor;

    public StorageDevice(String manufacturer, double volumeMemory, StorageType storageType, String formFactor) {
        this.manufacturer = manufacturer;
        this.volumeMemory = volumeMemory;
        this.storageType = storageType;
        this.formFactor = formFactor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
