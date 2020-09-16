public abstract class GraphicsCard {

    protected String manufacturer;
    protected double volumeMemory;
    protected String typeMemory;
    protected TypeCooling typeCooling;

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

    public String getTypeMemory() {
        return typeMemory;
    }

    public void setTypeMemory(String typeMemory) {
        this.typeMemory = typeMemory;
    }

    public TypeCooling getTypeCooling() {
        return typeCooling;
    }

    public void setTypeCooling(TypeCooling typeCooling) {
        this.typeCooling = typeCooling;
    }
}
