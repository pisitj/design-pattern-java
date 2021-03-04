public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        quantity += 1;
        System.out.println("Stock Name: " + name + ", Buy 1 qty, Remaining: " + quantity);
    }

    public void sell() {
        quantity -= 1;
        System.out.println("Stock Name: " + name + ", Sell 1 qty, Remaining: " + quantity);
    }
}
