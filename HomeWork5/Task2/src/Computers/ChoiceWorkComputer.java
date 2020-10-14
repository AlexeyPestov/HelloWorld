package Computers;

public class ChoiceWorkComputer implements Strategy {
    @Override
    public ComputerFactory choiceType() {
        return new WorkComputerFactory();
    }
}
