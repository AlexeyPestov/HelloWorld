package GraphicsCard;

import Computers.Computer;
import Computers.HomeComputer;
import Types.TypeCooling;

public abstract class GraphicsCard {

    protected String manufacturer;
    protected double volumeMemory;
    protected String typeMemory;
    protected TypeCooling typeCooling;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
