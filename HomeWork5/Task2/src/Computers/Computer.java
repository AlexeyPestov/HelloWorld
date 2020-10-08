package Computers;

import GraphichCard.GraphicsCard;
import Processor.Processor;
import RAM.RAM;
import StorageDevice.StorageDevice;
import Monitors.Monitor;

public abstract class Computer {

    Processor processor;
    protected RAM ram;
    protected GraphicsCard graphicsCard;
    protected StorageDevice storageDevice;
    protected Monitor monitor = new Monitor();

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void isCreate()  {
        String type = (this instanceof HomeComputer) ? "Домашний" : "Рабочий";
        if (processor != null && ram != null && graphicsCard != null && storageDevice != null && monitor != null)   {
            System.out.println(type + " компьютер собран");
        }
        else {
            System.out.println(type + " компьютер не собран");
        }
    }
}
