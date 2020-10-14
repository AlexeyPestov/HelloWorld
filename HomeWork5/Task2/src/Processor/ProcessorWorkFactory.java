package Processor;

public class ProcessorWorkFactory extends ProcessorFactory {

    @Override
    public Processor createProcessor() {
        return new ProcessorWork();
    }
}
