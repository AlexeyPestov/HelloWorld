import Computers.Computer;
import Factory.ComputerFactory;
import Factory.HomeComputerFactory;
import Factory.WorkComputerFactory;
import Types.ComputerType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Чтобы собрать компьютер введите WORK для рабочего, HOME для домашнего");
        Scanner scanner = new Scanner(System.in);
        ComputerType computerType = ComputerType.valueOf(scanner.nextLine());
        ComputerFactory computerFactory = null;
        switch (computerType)   {
            case HOME:
                computerFactory = new HomeComputerFactory();
                break;
            case WORK:
                computerFactory = new WorkComputerFactory();
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        if (computerFactory != null)    {
            Computer computer = computerFactory.createComputer();
            computer.isCreate();
        }
    }
}
