package chapt05.invoker;

import chapt05.command.*;

public class ManagerCommands {
    private Command command;

    public ManagerCommands(Command command) {
        this.command = command;
    }

    public void setManager(Command command) {
        this.command = command;
    }

    public void exec() {
        command.execute();
    }
}
