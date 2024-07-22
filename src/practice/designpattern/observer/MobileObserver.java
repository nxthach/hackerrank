package practice.designpattern.observer;

public class MobileObserver implements Observer {

    public MobileObserver() {
    }
    @Override
    public void onNext(String value) {
        System.out.println("MobileObserver: Received and send back to client : " + value);
    }
}
