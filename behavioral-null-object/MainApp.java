public class MainApp {
    public static final String[] customerNames = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String customer : customerNames) {
            if (customer.equalsIgnoreCase(name)) {
                return new ValidCustomer(name);
            }
        }
        return new InvalidCustomer();
    }

    public static void main(String[] args) {
        AbstractCustomer person1 = getCustomer("Rob");
        AbstractCustomer person2 = getCustomer("Bob");
        AbstractCustomer person3 = getCustomer("Julie");
        AbstractCustomer person4 = getCustomer("Laura");

        System.out.println("Get Customer Name:");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
        System.out.println(person4.getName());
    }
}
