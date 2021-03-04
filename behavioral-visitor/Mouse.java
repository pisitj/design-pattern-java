public class Mouse implements Component {
    public Mouse() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
