package GraphicsCard;

import Components.Component;
import Types.CoolingType;

public class GraphicsCard implements Component {

    private String manufacturer;
    private double volumeMemory;
    private String typeMemory;
    private CoolingType coolingType;

    public GraphicsCard(String manufacturer, double volumeMemory, String typeMemory, CoolingType coolingType) {
        this.manufacturer = manufacturer;
        this.volumeMemory = volumeMemory;
        this.typeMemory = typeMemory;
        this.coolingType = coolingType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
