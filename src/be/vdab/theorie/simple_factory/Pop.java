package be.vdab.theorie.simple_factory;

class Pop extends Cadeau {

    private final double prijs;

    public Pop(double prijs) {
        this.prijs = prijs;
    }

    @Override
    void geef() {
        System.out.println("Jij krijgt een pop van " + prijs + " euro.");
    }
}
