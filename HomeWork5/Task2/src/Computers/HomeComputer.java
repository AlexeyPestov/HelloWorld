package Computers;

import GraphichCard.GraphicsCard1;
import Processor.Processor1;
import RAM.RAM2;
import StorageDevice.StorageDevice2;

public class HomeComputer extends Computer {
    public HomeComputer() {
        processor = new Processor1();
        ram = new RAM2();
        graphicsCard = new GraphicsCard1();
        storageDevice = new StorageDevice2();
    }
}
