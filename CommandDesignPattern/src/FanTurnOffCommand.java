public class FanTurnOffCommand implements ICommand{
    private final Fan fan;

    public FanTurnOffCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.turnOff();
    }

    @Override
    public void undo() {
        fan.turnOn();
    }
}
