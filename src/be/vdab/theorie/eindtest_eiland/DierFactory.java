package be.vdab.theorie.eindtest_eiland;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public enum DierFactory {
    INSTANCE;

    public Dier maak(char soort, String naam) {
        return switch (soort) {
            case 'V' -> new Vogel(naam);
            case 'Z' -> new Zoogdier(naam);
            default -> throw new IllegalArgumentException("Onbekende soort: " + soort);
        };
    }
}