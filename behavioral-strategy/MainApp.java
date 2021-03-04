public class MainApp {
    public static void main(String[] args) {
        Context context = new Context();

        SumStrategy sumStrategy = new SumStrategy(); 
        context.setStrategy(sumStrategy);
        System.out.println(context.executeStrategy(10,5));

        SubtractStrategy subtractStrategy = new SubtractStrategy();
        context.setStrategy(subtractStrategy);
        System.out.println(context.executeStrategy(10,5));
    }
}
