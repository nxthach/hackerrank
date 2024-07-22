package practice.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();


        server.withdraw(new MobileObserver());
        server.withdraw(new WebsiteObserver());

        Observer observer = server.deposit(new MobileObserver());
    }
}
