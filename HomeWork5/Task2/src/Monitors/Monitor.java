package Monitors;

import Components.Component;

public class Monitor implements Component {
    private String manufacturer = "Dell";
    private int height;
    private int width;

    public Monitor (String manufacturer, int height, int width) {
        this.manufacturer = manufacturer;
        this.height = height;
        this.width = width;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
