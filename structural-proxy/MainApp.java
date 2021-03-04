public class MainApp {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("4K.png");
        System.out.println("1st call - Image 4K.png");
        proxyImage.display();
        System.out.println("2nd call - Image 4K.png");
        proxyImage.display();
        System.out.println("3rd call - Image 4K.png");
        proxyImage.display();
    }
}
