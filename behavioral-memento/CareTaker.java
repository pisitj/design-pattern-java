import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mementos; 

    public CareTaker() {
        this.mementos = new Stack<>();
    }

    public void addMemento(Memento m) {
        System.out.println("Caretaker : Adding Memento");
        mementos.push(m);
    }
    
    public Memento popMemento() {
        System.out.println("Caretaker : Checking for Memento ..");
        
        if (mementos.isEmpty()) {
            System.out.println("Caretaker : Memento is Empty !");
            return null;
        }

        System.out.println("Caretaker : Popping Memento");
        return mementos.pop();
    }
}
