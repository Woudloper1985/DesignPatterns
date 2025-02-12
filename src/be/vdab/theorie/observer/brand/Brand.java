package be.vdab.theorie.observer.brand;

import java.util.ArrayList;
import java.util.List;

public class Brand {
    private final List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    void breekUit() {
        notifyObservers();
    }
}
