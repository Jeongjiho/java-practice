package designpatterns.command;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageOnCommand garageOnCommand = new GarageOnCommand(garageDoor);

        remoteControl.setCommand(garageOnCommand);
        remoteControl.buttonWasPressed();
    }
}
