public class FileLogger implements Logger {
    @Override
    public void get(String message) {
        System.out.println("Log into file: " + message);
    }
}
