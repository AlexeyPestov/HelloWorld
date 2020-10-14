package StorageDevice;

public class StorageDeviceHomeFactory extends StorageDeviceFactory {
    @Override
    public StorageDevice createStorageDevice() {
        return new StorageDeviceHome();
    }
}
