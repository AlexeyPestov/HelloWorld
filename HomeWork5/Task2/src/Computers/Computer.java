package Computers;

import GraphicsCard.*;
import Processor.*;
import RAM.*;
import StorageDevice.*;
import Monitors.Monitor;
import Types.ComputerType;

public class Computer {

    protected Processor processor;
    protected RAM ram;
    protected GraphicsCard graphicsCard;
    protected StorageDevice storageDevice;
    protected Monitor monitor = new Monitor();
    protected int countMonitors;
    ComputerType computerType;

    public Computer(ComputerType computerType) {
        this.graphicsCard = new GraphicsCardFactory().createGraphics(computerType);
        this.processor = new ProcessorFactory().createProcessor(computerType);
        this.ram = new RAMFactory().createRAM(computerType);
        this.storageDevice = new StorageDeviceFactory().createStorageDevice(computerType);
        countMonitors = (computerType == ComputerType.HOME) ? 2 : 1;
        this.computerType = computerType;
    }

    public void isCreate()  {
        String type = (computerType == ComputerType.HOME) ? "Домашний" : "Рабочий";
        if (processor != null && ram != null && graphicsCard != null && storageDevice != null && monitor != null)   {
            System.out.println(type + " компьютер собран");
        }
        else {
            System.out.println(type + " компьютер не собран");
        }
    }
}
