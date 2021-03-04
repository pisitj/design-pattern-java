public class MainApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        System.out.println("circle ..");
        System.out.println("x: " + circle.x);
        System.out.println("y: " + circle.y);
        System.out.println("radius: " + circle.radius);
        System.out.println("color: " + circle.color);

        Circle cloneCircle = circle.clone();
        System.out.println("clone circle ..");
        System.out.println("x: " + cloneCircle.x);
        System.out.println("y: " + cloneCircle.y);
        System.out.println("radius: " + cloneCircle.radius);
        System.out.println("color: " + cloneCircle.color);
    }
}