class BlackBorderDecorator extends WidgetDecorator {
    public BlackBorderDecorator(Widget widget) {
        super(widget);
    }
    public void draw() {
        super.draw();
        System.out.println(" + Black Border");
    }
}