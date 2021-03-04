public class EmailEventListener implements EventListener {
    private String email;

    public EmailEventListener(String email) {
        this.email = email;
    }

    @Override
    public void execute(String eventType, String fileName) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + fileName);
    }
}
