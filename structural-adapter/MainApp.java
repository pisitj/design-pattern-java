public class MainApp {
    public static void main(String[] args) {
        Shape[] shapes = {
            (Shape) new Line(), 
            new RectangleToShapeAdapter(new Rectangle())
        };
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}