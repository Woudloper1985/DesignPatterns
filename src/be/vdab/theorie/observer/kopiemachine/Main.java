package be.vdab.theorie.observer.kopiemachine;

public class Main {
    public static void main(String[] args) {
        var machine = new FotokopieMachine(123);
        var technieker1 = new Technieker(1);
        var technieker2 = new Technieker(2);
        machine.addObserver(technieker1);
        machine.addObserver(technieker2);
        machine.kopieer(5_000);
        machine.kopieer(5_000);
    }
}
