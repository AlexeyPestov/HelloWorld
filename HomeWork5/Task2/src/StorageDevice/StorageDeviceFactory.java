package StorageDevice;

import Types.ComputerType;
import Types.StorageType;

public class StorageDeviceFactory {
    public static StorageDevice createStorageDevice(ComputerType computerType)  {
        if (computerType == ComputerType.HOME)  {
            return new StorageDevice("Kingston", 90000000, StorageType.SSD, "AT");
        }
        return new StorageDevice("Delta", 80000000, StorageType.HDD, "WT");
    }
}
