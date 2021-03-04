import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command) {
        System.out.println(command.getClass().getName());
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
