public abstract class RAM {

    protected String manufacturer;
    protected double volumeMemory;
    protected double frequency;
    protected String typeMemory;

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

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getTypeMemory() {
        return typeMemory;
    }

    public void setTypeMemory(String typeMemory) {
        this.typeMemory = typeMemory;
    }
}
