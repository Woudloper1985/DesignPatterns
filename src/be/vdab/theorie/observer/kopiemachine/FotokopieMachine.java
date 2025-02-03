package be.vdab.theorie.observer.kopiemachine;

import java.util.LinkedHashSet;
import java.util.Set;

public class FotokopieMachine {
    private final static int ONDERHOUD_OM_DE_PAGINAS = 10_000;
    private final long serienummer;
    private int aantalPaginasSindsLaatsteOnderhoudsbeurt;
    private Set<Observer> observers = new LinkedHashSet<>();

    FotokopieMachine(long serienummer) {
        this.serienummer = serienummer;
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    void kopieer(int paginas) {
        System.out.println(paginas + " fotokopie(s)");
        aantalPaginasSindsLaatsteOnderhoudsbeurt += paginas;
        if (aantalPaginasSindsLaatsteOnderhoudsbeurt >= ONDERHOUD_OM_DE_PAGINAS) {
            notifyObservers();
        }
    }

    long getSerieNummer() {
        return serienummer;
    }

    void doeOnderhoud() {
        aantalPaginasSindsLaatsteOnderhoudsbeurt = 0;
    }
}
