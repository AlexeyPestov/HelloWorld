package StorageDevice;

import Types.ComputerType;
import Types.TypeStorage;

public class StorageDeviceFactory {
    public StorageDevice createStorageDevice(ComputerType computerType)  {
        if (computerType == ComputerType.HOME)  {
            return new StorageDevice("Kingston", 90000000, TypeStorage.SSD, "AT");
        }
        return new StorageDevice("Delta", 80000000, TypeStorage.HDD, "WT");
    }
}
