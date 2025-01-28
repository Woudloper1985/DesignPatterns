package be.vdab.theorie.simple_factory.kerstman;

class Pop extends Cadeau {

    public Pop(double prijs) {
        super(prijs);
    }

    @Override
    void geef() {
        System.out.println("Jij krijgt een pop van " + getPrijs() + " euro.");
    }
}
