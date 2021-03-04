public class RedBorderDecorator extends WidgetDecorator {
    public RedBorderDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println(" + Red Border");
    }
}