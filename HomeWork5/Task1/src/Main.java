import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger();
        int a = enter("a");
        int b = enter("b");
        Calculator calculator = new Calculator(a, b, logger);
    }

    public static int enter (String name)  {
        System.out.println("Введите " + name);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

}
