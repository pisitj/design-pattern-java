public class GuiApp {
    private Button button;
    private Checkbox checkbox;

    public GuiApp (AbstractFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}