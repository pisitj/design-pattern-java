import java.util.Scanner;

public class MainApp {
    private static GuiApp configureApplication() {
        GuiApp app;
        AbstractFactory factory;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter OS: ");
    
        String osName = input.nextLine();

        if (osName.equals("MacOS")) {
            System.out.println("User OS: " + osName);
            factory = new MacFactory();
            app = new GuiApp(factory);
        }
        else {
            System.out.println("default OS: Window");
            factory = new WindowFactory();
            app = new GuiApp(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        GuiApp app = configureApplication();
        app.paint();
    }
}