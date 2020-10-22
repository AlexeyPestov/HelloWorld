package Components;

import GraphicsCard.GraphicsCardFactory;
import Monitors.MonitorFactory;
import Processor.ProcessorFactory;
import RAM.RAMFactory;
import StorageDevice.StorageDeviceFactory;
import Types.ComputerType;
import Types.ComponentType;

public class ComponentFactory {
    private ComputerType computerType;

    public ComponentFactory(ComputerType computerType) {
        this.computerType = computerType;
    }

    public Component createComponent(ComponentType componentType)  {
        switch (componentType)  {
            case PROCESSOR: {
                return ProcessorFactory.createProcessor(computerType);
            }
            case RAM:   {
                return RAMFactory.createRAM(computerType);
            }
            case GRAPHIC_CARD:  {
                return GraphicsCardFactory.createGraphics(computerType);
            }
            case STORAGE:   {
                return StorageDeviceFactory.createStorageDevice(computerType);
            }

            case MONITOR:   {
                return MonitorFactory.createMonitor(computerType);
            }

        }
        return null;
    }
}
