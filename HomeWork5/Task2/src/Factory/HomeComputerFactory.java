package Factory;

import Computers.Computer;
import Computers.HomeComputer;

public class HomeComputerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new HomeComputer();
    }
}
