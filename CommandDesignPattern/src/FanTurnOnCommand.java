public class FanTurnOnCommand implements ICommand{
    private final Fan fan;

    public FanTurnOnCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}
