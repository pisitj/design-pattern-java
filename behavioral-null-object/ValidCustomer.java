public class ValidCustomer extends AbstractCustomer {
    public ValidCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNotCustomer() {
        return false;
    }
}
