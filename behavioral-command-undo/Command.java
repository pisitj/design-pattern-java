public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
        System.out.println("Command - backup : " + backup);
    }

    public void undo() {
        editor.textField.setText(backup);
        System.out.println("Command - undo : " + backup);
    }

    public abstract boolean execute();
}
