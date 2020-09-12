public class ConsoleLogger implements Logger {
    @Override
    public void get(String message) {
        System.out.println("Log into console: " + message);
    }
}
