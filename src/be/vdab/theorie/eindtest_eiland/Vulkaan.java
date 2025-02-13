package be.vdab.theorie.eindtest_eiland;

import java.util.ArrayList;
import java.util.List;

public class Vulkaan {
    private final List<be.vdab.theorie.eindtest_eiland.Observer> observers = new ArrayList<>();
    private boolean isUitbarstend;

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    /*je kan een removeObserver maken, maar lijkt me niet wenselijk zonder de inwoner te verwijderen*/


    void notifyObservers() {
        if (isUitbarstend) {
            observers.forEach(observer -> observer.barstUit(this));
        } else {
            observers.forEach(observer -> observer.stopt(this));
        }
    }

    public void barstUit() {
        isUitbarstend = true;
        System.out.println("\nDE VULKAAN BARST UIT!\n");
        notifyObservers();
    }

    public void stopt() {
        isUitbarstend = false;
        System.out.println("\nDe vulkaan is gestopt met uitbarsten:\n");
        notifyObservers();
    }
}