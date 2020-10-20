import Computers.*;
import Types.ComputerType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = null;
        System.out.println("Чтобы собрать компьютер введите WORK для рабочего, HOME для домашнего");
        Scanner scanner = new Scanner(System.in);
        ComputerType computerType = ComputerType.valueOf(scanner.nextLine());
        strategy = new ChoiceComputer(computerType);
        context.setStrategy(strategy);
        ComputerFactory computerFactory = context.execStrategy();
        if (computerFactory != null)    {
            Computer computer = computerFactory.createComputer(computerType);
            computer.isCreate();
        }
        System.out.println();
    }
}
