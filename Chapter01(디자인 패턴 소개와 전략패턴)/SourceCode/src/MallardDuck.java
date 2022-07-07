public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlywithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다");
    }
}
