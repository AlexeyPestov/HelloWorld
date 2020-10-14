package StorageDevice;

public class StorageDeviceWorkFactory extends StorageDeviceFactory {
    @Override
    public StorageDevice createStorageDevice() {
        return new StorageDeviceWork();
    }
}
