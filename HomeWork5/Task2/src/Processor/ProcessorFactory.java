package Processor;

import Types.ComputerType;

public class ProcessorFactory {

    public Processor createProcessor(ComputerType computerType)  {
        if (computerType == ComputerType.HOME)  {
            return new Processor(200.0, 8, 778.9, "Процессор", "Intel");
        }
        return new Processor(8742.0, 1, 7375.9, "Процессор2", "Apple");
    }
}
