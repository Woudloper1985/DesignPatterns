package be.vdab.theorie.simple_factory.kerstman;

class CadeauMain {
    public static void main(String[] args) {
        var cadeau1 = CadeauFactory.INSTANCE.koop(12);
        cadeau1.geef();
        var cadeau2 = CadeauFactory.INSTANCE.koop(6);
        cadeau2.geef();
        var cadeau3 = CadeauFactory.INSTANCE.koop(4);
        cadeau3.geef();
        var cadeau4 = CadeauFactory.INSTANCE.koop(14);
        cadeau4.geef();
        System.out.println("Jij bent stout, jij krijgt van de roe!");
    }
}