package Computers;

import Computers.Computer;
import GraphichCard.GraphicsCard2;
import Processor.Processor2;
import RAM.RAM1;
import StorageDevice.StorageDevice1;

public class WorkComputer extends Computer {
    public WorkComputer() {
        processor = new Processor2();
        ram = new RAM1();
        graphicsCard = new GraphicsCard2();
        storageDevice = new StorageDevice1();
    }
}
