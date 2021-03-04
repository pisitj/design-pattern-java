public class OffState implements State {
    public String state;
    
    public OffState() {
        this.state = "turn off";
        System.out.println("current state: " + this.state);
    }

    @Override
    public void execute(Context wrapper) {
        System.out.println("setting state to low speed ...");
        wrapper.setState(new LowState());
    }
}
