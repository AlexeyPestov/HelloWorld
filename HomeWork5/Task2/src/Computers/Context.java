package Computers;

import Types.ComputerType;

public class Context {
    private Strategy strategy;
    private ComputerType computerType;

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    public void setStrategy (Strategy strategy) {
        this.strategy = strategy;
    }
    public ComputerFactory execStrategy()   {
        return strategy.choiceType(computerType);
    }
}
