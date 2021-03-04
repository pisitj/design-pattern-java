public class MainApp {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        System.out.println("1st Get Singleton with value FOO: " + singleton.value);
        
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        
        // If you see the same value, then singleton was reused !
        System.out.println("Try to Get Singleton with value BAR: " + anotherSingleton.value); 

        
    }
}