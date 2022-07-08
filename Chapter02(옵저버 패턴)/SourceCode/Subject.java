public interface Subject {

    public void registerObserver(Observer o);   //옵저버 등록 메서드
    public void removeObserver(Observer o);     //옵저버 제거 메소드
    public void notifyObservers();              //주제의 상태가 변경되었을 때 모든 옵저버에게 변경내용을 알리려고 호출되는 메서드
}
