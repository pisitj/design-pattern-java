import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command command) {
        history.push(command);
        System.out.println("CommandHistory - push");
    }

    public Command pop() {
        System.out.println("CommandHistory - pop");
        return history.pop();
        
    }

    public boolean isNotAvailable() {
        System.out.println("CommandHistory - isEmpty : " + history.isEmpty());
        return history.isEmpty();
    }
}
