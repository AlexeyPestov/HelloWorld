package Processor;

public class ProcessorHomeFactory extends ProcessorFactory {
    @Override
    public Processor createProcessor() {
        return new ProcessorHome();
    }
}
