package Computers;

import Components.Component;
import Components.ComponentFactory;
import GraphicsCard.*;
import Processor.*;
import RAM.*;
import StorageDevice.*;
import Monitors.Monitor;
import Types.ComponentType;
import Types.ComputerType;

public class Computer {

    protected Component processor;
    protected Component ram;
    protected Component graphicsCard;
    protected Component storageDevice;
    protected Component monitor;
    protected int countMonitors;
    ComputerType computerType;

    public Computer(ComputerType computerType) {
        ComponentFactory componentFactory = new ComponentFactory(computerType);
        this.processor = componentFactory.createComponent(ComponentType.PROCESSOR);
        this.graphicsCard = componentFactory.createComponent(ComponentType.GRAPHIC_CARD);
        this.ram = componentFactory.createComponent(ComponentType.RAM);
        this.storageDevice = componentFactory.createComponent(ComponentType.STORAGE);
        this.monitor = componentFactory.createComponent(ComponentType.MONITOR);
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
