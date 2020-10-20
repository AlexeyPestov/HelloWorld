package GraphicsCard;

import Types.TypeCooling;

public class GraphicsCard {

    String manufacturer;
    double volumeMemory;
    String typeMemory;
    TypeCooling typeCooling;

    public GraphicsCard(String manufacturer, double volumeMemory, String typeMemory, TypeCooling typeCooling) {
        this.manufacturer = manufacturer;
        this.volumeMemory = volumeMemory;
        this.typeMemory = typeMemory;
        this.typeCooling = typeCooling;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
