public class MainApp {
    public static void main(String[] args) {
        CareTaker caretaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("1");
        caretaker.addMemento(originator.createMemento());

        originator.setState("22");
        originator.setState("333");
        caretaker.addMemento(originator.createMemento());

        originator.setState("4444");

        originator.restoreState(caretaker.popMemento());
        originator.restoreState(caretaker.popMemento());
        originator.restoreState(caretaker.popMemento());
    }
}
