package be.vdab.theorie.simple_factory;

class Boekenbon extends Cadeau {

    public Boekenbon(double prijs) {
        super(prijs);
    }

    @Override
    void geef() {
        System.out.println("Jij krijgt een boekenbon van " + getPrijs() + " euro.");
    }
}