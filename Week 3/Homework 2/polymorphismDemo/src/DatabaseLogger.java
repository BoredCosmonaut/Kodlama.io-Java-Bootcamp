public class DatabaseLogger extends  BaseLogger {
    @Override
    public void Log(String message) {
        System.out.println("Logged to the database: " + message);
    }
}