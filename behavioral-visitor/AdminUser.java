public class AdminUser implements Visitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Admin is using Keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Admin is using Mouse.");
    }

    @Override
    public void visit(HeadPhone headPhone) {
        System.out.println("Admin is using HeadPhone.");
    }
}
