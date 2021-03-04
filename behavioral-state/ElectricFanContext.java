public class ElectricFanContext implements Context {
    private State currentState;

    public ElectricFanContext() {
        this.currentState = new OffState();
    }

    @Override
    public void setState(State s) {
        this.currentState = s;
    }

    @Override
    public void execute() {
        System.out.println("--- Execute ---");
        currentState.execute(this);
    }
}
