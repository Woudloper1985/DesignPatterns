package be.vdab.theorie.decorator;

public abstract class KoffieDecorator implements Koffie {
    protected final Koffie gedecoreerdeKoffie;

    KoffieDecorator(Koffie koffie) {
        this.gedecoreerdeKoffie = koffie;
    }
}
