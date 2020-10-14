package Computers;
import GraphicsCard.*;
import Processor.*;
import RAM.*;
import StorageDevice.*;

public class WorkComputer extends Computer {
    public WorkComputer() {
        super(new GraphicsCardWorkFactory(), new ProcessorWorkFactory(), new RAMWorkFactory(), new StorageDeviceWorkFactory());
    }
}
