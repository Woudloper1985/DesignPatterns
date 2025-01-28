package be.vdab.theorie.simple_factory.kerstman;

abstract class Cadeau {
    private final double prijs;

    public Cadeau(double prijs) {
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }

    abstract void geef();
}