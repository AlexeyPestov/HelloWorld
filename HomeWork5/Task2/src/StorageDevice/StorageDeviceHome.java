package StorageDevice;

import Types.TypeStorage;

public class StorageDeviceHome extends StorageDevice {
    public StorageDeviceHome() {
        manufacturer = "Kingston";
        volumeMemory = 90000000;
        typeStorage = TypeStorage.SSD;
        formFactor = "AT";
    }
}
