package StorageDevice;

import Types.TypeStorage;

public class StorageDeviceWork extends StorageDevice {
    public StorageDeviceWork() {
        manufacturer = "Delta";
        volumeMemory = 80000000;
        typeStorage = TypeStorage.HDD;
        formFactor = "WT";
    }
}
