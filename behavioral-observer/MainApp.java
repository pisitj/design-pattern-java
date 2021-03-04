public class MainApp {
    public static void main(String[] args) {
        FileEditor editor = new FileEditor();

        LogEventListener listener1 = new LogEventListener("log.txt");
        EmailEventListener listener2 = new EmailEventListener("admin@example.com");

        editor.events.subscribe("open", listener1);
        editor.events.subscribe("open", listener2);
        editor.events.subscribe("save", listener1);
        editor.events.subscribe("save", listener2);

        editor.openFile("test.txt");
        editor.saveFile("test.txt");

        editor.events.unsubscribe("open", listener1);
        editor.events.unsubscribe("open", listener2);

        editor.openFile("test.txt");
        editor.saveFile("test.txt");
    }
}
