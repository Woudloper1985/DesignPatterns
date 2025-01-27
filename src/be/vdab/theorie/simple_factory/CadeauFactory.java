package be.vdab.theorie.simple_factory;

enum CadeauFactory {
    INSTANCE;

    Cadeau koop(int leeftijd) {
        if (leeftijd <= 5) {
            return new Pop(20.50);
        }
        if (leeftijd >= 6 && leeftijd <= 12) {
            return new Gezelschapsspel(40.99);
        }
        return new Boekenbon(60);
    }
}
