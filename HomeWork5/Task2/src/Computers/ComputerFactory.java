package Computers;

import Types.ComputerType;

public class ComputerFactory {
    public Computer createComputer(ComputerType computerType)   {
        return new Computer(computerType);
    }
}
