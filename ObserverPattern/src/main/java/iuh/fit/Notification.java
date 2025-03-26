package iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newBookArrived(String bookName) {
        notifyObservers("New book arrived: " + bookName);
    }

    public void bookExpiring(String bookName) {
        notifyObservers("Book expiring: " + bookName);
    }
}
