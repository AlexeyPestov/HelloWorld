package StorageDevice;

import Types.TypeStorage;

public class StorageDevice1 extends StorageDevice {
    public StorageDevice1() {
        manufacturer = "Kingston";
        volumeMemory = 90000000;
        typeStorage = TypeStorage.SSD;
        formFactor = "AT";
    }
}
