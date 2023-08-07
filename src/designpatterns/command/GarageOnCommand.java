package designpatterns.command;

public class GarageOnCommand implements Command {
    GarageDoor garageDoor;

    public GarageOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
