public class FanRemote {
    private final ICommand turnOnCommand, turnOffCommand;

    public FanRemote(ICommand turnOnCommand, ICommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void turnOnButtonClick() {
        turnOnCommand.execute();
    }

    public void turnOffButtonClick() {
        turnOffCommand.execute();
    }
}
