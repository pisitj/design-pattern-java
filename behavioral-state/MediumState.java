public class MediumState implements State {
    public String state;
    
    public MediumState() {
        this.state = "medium speed";
        System.out.println("current state: " + this.state);
    }

    @Override
    public void execute(Context wrapper) {
        System.out.println("setting state to high speed ...");
        wrapper.setState(new HighState());
    }
}
