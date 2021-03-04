public class Originator {
    private String state;

    public Originator() {
        this.state = state;
    }

    public void setState(String state) {
        System.out.println("Originator : Setting State to " + state);
        this.state = state;
    }

    public Memento createMemento() {
        System.out.println("Originator : Creating Memento from State "+ state);
        return new Memento(state);
    }

    public void restoreState(Memento m) {
        if (m == null) {
            System.out.println("Originator : No Memento to Restore !, still on State " + state);
            return;
        }

        state = m.getState();
        System.out.println("Originator : Restore to State "+ state +" from Memento");
    }
}
