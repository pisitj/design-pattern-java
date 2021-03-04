public class AnonymousUser implements Visitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Someone is using Keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Someone is using Mouse.");
    }

    @Override
    public void visit(HeadPhone headPhone) {
        System.out.println("Someone is using HeadPhone.");
    }
}
