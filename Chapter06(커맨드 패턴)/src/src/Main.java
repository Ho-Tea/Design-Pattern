public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

/*
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);


        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);


 */
        remoteControl.setCommand(0, () -> livingRoomLight.on(),() -> livingRoomLight.off());    //람다를 이용한 식
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}