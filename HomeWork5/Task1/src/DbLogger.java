public class DbLogger implements Logger {
    @Override
    public void get(String message) {
        System.out.println("Log into database: " + message);
    }
}
