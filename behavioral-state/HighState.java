public class HighState implements State {
    public String state;
    
    public HighState() {
        this.state = "high speed";
        System.out.println("current state: " + this.state);
    }

    @Override
    public void execute(Context wrapper) {
        System.out.println("setting state to turn off ...");
        wrapper.setState(new OffState());
    }
}
