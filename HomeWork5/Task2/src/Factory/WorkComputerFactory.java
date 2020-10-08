package Factory;

import Computers.Computer;
import Computers.WorkComputer;

public class WorkComputerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new WorkComputer();
    }
}
