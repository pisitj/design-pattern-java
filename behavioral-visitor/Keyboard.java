public class Keyboard implements Component {
    public Keyboard() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
