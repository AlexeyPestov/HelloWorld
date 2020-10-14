package Computers;

public class ChoiceHomeComputer implements Strategy {
    @Override
    public ComputerFactory choiceType() {
        return new HomeComputerFactory();
    }
}
