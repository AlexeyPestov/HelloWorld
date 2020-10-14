package Computers;

public class Context {
    private Strategy strategy;
    public void setStrategy (Strategy strategy) {
        this.strategy = strategy;
    }
    public ComputerFactory execStrategy()   {
        return strategy.choiceType();
    }
}
