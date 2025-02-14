package be.vdab.theorie.eindtest_eiland;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        var eiland = Eiland.INSTANCE;
        var vulkaan = eiland.getVulkaan();

        try (var reader = Files.newBufferedReader(Path.of("inwoners.txt"))) {
            for (String regel = reader.readLine(); regel != null; regel = reader.readLine()) {
                char soort = regel.charAt(0);
                String naam = regel.substring(2);
                eiland.voegInwonerToe(InwonerFactory.INSTANCE.maak(soort, naam));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //eiland.toonInwoners();
        vulkaan.barstUit();
        vulkaan.stopt();
    }
}