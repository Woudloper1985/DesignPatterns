package be.vdab.theorie.eindtest_eiland;

public enum InwonerFactory {
    INSTANCE;

    public Inwoner maak(char soort, String naam) {
        return switch (soort) {
            case 'V' -> new Vogel(naam);
            case 'Z' -> new Zoogdier(naam);
            default -> throw new IllegalArgumentException("Onbekende soort: " + soort);
        };
    }
}