import java.util.Scanner;

public class LoggerFactory {
    public static Logger getLogger()    {
        System.out.println("Введите тип логгера");
        Scanner scanner = new Scanner(System.in);
        TypeLogger typeLogger = TypeLogger.valueOf(scanner.nextLine().toUpperCase());
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
        return logger;
    }
}
