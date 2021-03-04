import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();

        server.register("admin@example.com", "admin_password");
        server.register("user@example.com", "user_password");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server));

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.println("-----------------");

            System.out.println("Enter email: ");
            String email = reader.readLine();
            
            System.out.println("Enter password: ");
            String password = reader.readLine();

            success = server.logIn(email, password);
        } while (!success);
    }
}