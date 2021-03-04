public class MainApp {
    public static void main(String[] args) {
        // Visitor
        AnonymousUser anonymousUser = new AnonymousUser();
        AdminUser adminUser = new AdminUser();

        // Component
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        HeadPhone headPhone = new HeadPhone();

        // Component accept Visitor
        keyboard.accept(anonymousUser);
        mouse.accept(anonymousUser);
        headPhone.accept(anonymousUser);

        keyboard.accept(adminUser);
        mouse.accept(adminUser);
        headPhone.accept(adminUser);
    }
}
