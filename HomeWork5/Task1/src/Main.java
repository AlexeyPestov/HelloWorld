import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите тип логгера");
        Scanner scanner = new Scanner(System.in);
        TypeLogger typeLogger = TypeLogger.valueOf(scanner.nextLine().toUpperCase());
        String message = "Привет";
        Logger logger = null;
        switch (typeLogger){
            case FILE:  {
                logger = new FileLogger();
                break;
            }
            case CONSOLE:   {
                logger = new ConsoleLogger();
                break;
            }
            case DB:    {
                logger = new DbLogger();
                break;
            }
        }
        if (logger != null) {
            logger.get(message);
        }
    }
}
