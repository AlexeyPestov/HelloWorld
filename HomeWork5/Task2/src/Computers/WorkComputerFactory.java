package Computers;

public class WorkComputerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new WorkComputer();
    }
}
