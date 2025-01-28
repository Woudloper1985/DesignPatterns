package be.vdab.theorie.simple_factory.kerstman;

class Gezelschapsspel extends Cadeau {

    public Gezelschapsspel(double prijs) {
        super(prijs);
    }

    @Override
    void geef() {
        System.out.println("Jij krijgt een gezelschapsspel van " + getPrijs() + " euro.");
    }
}