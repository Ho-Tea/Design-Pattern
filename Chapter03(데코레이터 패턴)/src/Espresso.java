public class Espresso extends Beverage{
    public Espresso(){
        description = "에소프레소";  //Beverage에서 인스턴스변수를 상속받는다
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
