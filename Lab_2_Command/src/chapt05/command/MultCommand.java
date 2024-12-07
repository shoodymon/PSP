package chapt05.command;

import chapt05.receiver.*;

public class MultCommand extends Command {
    private ArrayOperation ao;

    public MultCommand(ArrayOperation ao) {
        this.ao = ao;
    }

    @Override
    public void execute() {
        this.ao.product();
    }
}
