package be.vdab.theorie.eindtest_eiland;

public enum InwonerFactory {
    INSTANCE;

    public Inwoner maak(Character soort, String naam) {
        var basisInwoner = new BasisInwoner(naam);

        return switch (soort) {
            case 'V' -> new Vogel(basisInwoner);
            case 'Z' -> new Zoogdier(basisInwoner);
            default -> throw new IllegalArgumentException("Onbekende soort: " + soort);
        };
    }
}