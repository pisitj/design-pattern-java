public class LogEventListener implements EventListener {
    private String logFileName;

    public LogEventListener(String log) {
        this.logFileName = log;
    }

    @Override
    public void execute(String eventType, String fileName) {
        System.out.println("Log to " + logFileName + ": Someone has performed " + eventType + " operation with the following file: " + fileName);
    }
}
