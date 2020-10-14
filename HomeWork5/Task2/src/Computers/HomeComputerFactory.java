package Computers;

public class HomeComputerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new HomeComputer();
    }
}
