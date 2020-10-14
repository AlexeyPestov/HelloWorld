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
        switch (computerType)   {
            case HOME:
                strategy = new ChoiceHomeComputer();
                break;
            case WORK:
                strategy = new ChoiceWorkComputer();
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        context.setStrategy(strategy);
        ComputerFactory computerFactory = context.execStrategy();
        if (computerFactory != null)    {
            Computer computer = computerFactory.createComputer();
            computer.isCreate();
        }
        System.out.println();
    }
}
