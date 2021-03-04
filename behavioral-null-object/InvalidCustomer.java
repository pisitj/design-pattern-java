public class InvalidCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not a Customer !";
    }

    @Override
    public boolean isNotCustomer() {
        return true;
    }
}
