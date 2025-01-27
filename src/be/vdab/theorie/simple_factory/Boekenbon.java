package be.vdab.theorie.simple_factory;

class Boekenbon extends Cadeau {
    private final double prijs;

    public Boekenbon(double prijs) {
        this.prijs = prijs;
    }

    @Override
    void geef() {
        System.out.println("Jij krijgt een boekenbon van " + prijs + " euro.");
    }
}