package Computers;

import Types.ComputerType;

public interface Strategy {
    ComputerFactory choiceType(ComputerType computerType);
}
