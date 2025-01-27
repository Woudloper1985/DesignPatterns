package be.vdab.theorie.simple_factory;

class Gezelschapsspel extends Cadeau {
    private final double prijs;

    public Gezelschapsspel(double prijs) {
        this.prijs = prijs;
    }

    @Override
    void geef() {
        System.out.println("Jij krijgt een gezelschapsspel van " + prijs + " euro.");
    }
}