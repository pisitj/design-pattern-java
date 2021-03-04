public class FileEditor {
    public FileEventManager events;

    public FileEditor() {
        this.events = new FileEventManager("open", "save");
    }

    public void openFile(String fileName) {
        System.out.println("***** Someone opening file: " + fileName);
        events.notify("open", fileName);
    }

    public void saveFile(String fileName) {
        System.out.println("***** Someone saving file: " + fileName);
        events.notify("save", fileName);
    }
}
