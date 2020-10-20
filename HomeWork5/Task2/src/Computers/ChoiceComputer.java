package Computers;

import Types.ComputerType;

public class ChoiceComputer implements Strategy {
    ComputerType computerType;

    public ChoiceComputer(ComputerType computerType) {
        this.computerType = computerType;
    }

    @Override
    public ComputerFactory choiceType(ComputerType computerType) {
        return new ComputerFactory();
    }
}
