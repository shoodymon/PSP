package chapt05.command;

import chapt05.receiver.*;

public class AddCommand extends Command {
    private ArrayOperation ao;

    public AddCommand(ArrayOperation ao) {
        this.ao = ao;
    }

    @Override
    public void execute() {
        this.ao.sum();
    }
}
