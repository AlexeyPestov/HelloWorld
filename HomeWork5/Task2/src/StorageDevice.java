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

    public double getVolumeMemory() {
        return volumeMemory;
    }

    public void setVolumeMemory(double volumeMemory) {
        this.volumeMemory = volumeMemory;
    }

    public TypeStorage getTypeStorage() {
        return typeStorage;
    }

    public void setTypeStorage(TypeStorage typeStorage) {
        this.typeStorage = typeStorage;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}
