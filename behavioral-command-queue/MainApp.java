public class MainApp {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockCommand = new BuyStock(abcStock);
        SellStock sellStockCommand = new SellStock(abcStock);

        Broker broker = new Broker();

        System.out.println("---- Add Command ----");
        broker.addCommand(buyStockCommand);
        broker.addCommand(buyStockCommand);
        broker.addCommand(buyStockCommand);
        broker.addCommand(buyStockCommand);
        broker.addCommand(buyStockCommand);

        System.out.println("---- Execute Command ----");
        broker.executeCommands();

        System.out.println("---- Add Command ----");
        broker.addCommand(sellStockCommand);
        broker.addCommand(sellStockCommand);
        broker.addCommand(sellStockCommand);
        
        System.out.println("---- Execute Command ----");
        broker.executeCommands();
    }
}
