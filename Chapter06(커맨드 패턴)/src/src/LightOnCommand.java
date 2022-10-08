public class LightOnCommand implements Command{ //커맨드 객체
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
