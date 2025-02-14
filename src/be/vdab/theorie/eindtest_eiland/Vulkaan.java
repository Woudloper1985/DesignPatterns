package be.vdab.theorie.eindtest_eiland;

import java.util.ArrayList;
import java.util.List;

public class Vulkaan {
    private final List<Observer> observers = new ArrayList<>();
    private boolean isUitbarstend;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Je kan een removeObserver maken, maar lijkt me niet wenselijk zonder ook de inwoner te verwijderen.

    void notifyObservers() {
        if (isUitbarstend) {
            observers.forEach(Observer::barstUit);
        } else {
            observers.forEach(Observer::stopt);
        }
    }

    public void barstUit() {
        isUitbarstend = true;
        System.out.println("\nDE VULKAAN BARST UIT!");
        notifyObservers();
    }

    public void stopt() {
        isUitbarstend = false;
        System.out.println("\nDe vulkaan is gestopt met uitbarsten:");
        notifyObservers();
    }
}