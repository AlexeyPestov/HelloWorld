package Computers;

import GraphicsCard.GraphicsCardHomeFactory;
import Processor.ProcessorHomeFactory;
import RAM.RAMHomeFactory;
import StorageDevice.StorageDeviceHomeFactory;

public class HomeComputer extends Computer {
    public HomeComputer() {
        super(new GraphicsCardHomeFactory(), new ProcessorHomeFactory(), new RAMHomeFactory(), new StorageDeviceHomeFactory());
    }
}
