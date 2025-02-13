package be.vdab.theorie.eindtest_eiland;

import java.util.ArrayList;
import java.util.List;

public class Vulkaan {
    private final List<be.vdab.theorie.eindtest_eiland.Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    void barstUit() {
        notifyObservers();
    }
}
