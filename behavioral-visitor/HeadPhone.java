public class HeadPhone implements Component {
    public HeadPhone() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
