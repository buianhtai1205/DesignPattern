public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();

        FanTurnOnCommand fanTurnOnCommand = new FanTurnOnCommand(fan);
        FanTurnOffCommand fanTurnOffCommand = new FanTurnOffCommand(fan);

        FanRemote fanRemote = new FanRemote(fanTurnOnCommand, fanTurnOffCommand);

        fanRemote.turnOnButtonClick();
        fanRemote.turnOffButtonClick();
    }
}