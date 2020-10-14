package Computers;

import GraphicsCard.*;
import Processor.*;
import RAM.*;
import StorageDevice.*;
import Monitors.Monitor;

public abstract class Computer {

    protected Processor processor;
    protected RAM ram;
    protected GraphicsCard graphicsCard;
    protected StorageDevice storageDevice;
    protected Monitor monitor = new Monitor();

    public Computer(GraphicsCardFactory graphicsCardFactory, ProcessorFactory processorFactory, RAMFactory ramFactory, StorageDeviceFactory storageDeviceFactory) {
        this.graphicsCard = graphicsCardFactory.createGraphics();
        this.processor = processorFactory.createProcessor();
        this.ram = ramFactory.createRAM();
        this.storageDevice = storageDeviceFactory.createStorageDevice();
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
