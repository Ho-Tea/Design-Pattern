public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("아무것도 하지 않습니다");
    }
}
