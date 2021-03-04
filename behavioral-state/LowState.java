public class LowState implements State {
    public String state;

    public LowState() {
        this.state = "low speed";
        System.out.println("current state: " + this.state);
    }

    @Override
    public void execute(Context wrapper) {
        System.out.println("setting state to medium speed ...");
        wrapper.setState(new MediumState());
    }
}
