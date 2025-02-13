package be.vdab.theorie.eindtest_eiland;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        var vulkaan = new Vulkaan();

        try (var reader = Files.newBufferedReader(Path.of("inwoners.txt"))) {
            for (String regel = reader.readLine(); regel != null; regel = reader.readLine()) {
                char soort = regel.charAt(0);
                String naam = regel.substring(2);
                var Inwoner = InwonerFactory.INSTANCE.maak(soort, naam);
                Eiland.INSTANCE.voegInwonerToe(Inwoner);
                vulkaan.addObserver(Inwoner);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       Eiland.INSTANCE.getInwoners();
   //vulkaan.barstUit();
    }
}