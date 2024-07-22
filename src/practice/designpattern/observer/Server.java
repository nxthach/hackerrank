package practice.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Server {

    private List<Observer> observers = new ArrayList<>();

    public void addClient(Observer observer){
        observers.add(observer);
    }

    public void withdraw(){
        notifyToAllClient();
    }




    public void withdraw(Observer observer){
        //get data
        observer.onNext("2000");//send back to client
    }

    public Observer deposit(Observer observer){
        observer.onNext("2000");//send back to client
        return new Observer() {
            @Override
            public void onNext(String value) {
                System.out.println("TEMP");
            }
        };
    }







    private void notifyToAllClient(){
        for (Observer observer : observers){
            observer.onNext("1000");
        }
    }


}
