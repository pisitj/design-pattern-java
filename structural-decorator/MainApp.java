public class MainApp {
    public static void main(String[] args) {
        Widget widget1 = 
            new RedBorderDecorator(
                new BlackBorderDecorator(
                    new TextFieldWidget(100,50)
                )
            );
        System.out.println("Draw Widget 1 ..");
        widget1.draw();
        System.out.println("------------------");

        Widget widget2 = 
            new BlackBorderDecorator(
                new RedBorderDecorator(
                    new TextFieldWidget(40,30)
                )
            );
        System.out.println("Draw Widget 2 ..");
        widget2.draw();
        System.out.println("------------------");
    }
}