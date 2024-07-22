package practice.designpattern.observer;

public class WebsiteObserver implements Observer {

    public WebsiteObserver() {
    }

    @Override
    public void onNext(String value) {
        System.out.println("WebsiteObserver: Received and send back to client : " + value);
    }
}
