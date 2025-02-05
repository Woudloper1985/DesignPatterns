package be.vdab.theorie.strategy;

import java.util.PropertyResourceBundle;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        var personen = new Persoon[]{new Persoon("Jean", "Smits", "heer"),
                new Persoon("Jeanine", "Desmet", "mevrouw")};
        for (var persoon : personen) {
            System.out.println(persoon.maakBriefHoofding(
                    (pers) -> informeel(pers.getVoornaam())));
        }
        for (var persoon : personen) {
            System.out.println(persoon.maakBriefHoofding(
                    (pers) -> formeel(pers.getFamilienaam(), pers.getTitel())));
        }
    }

    private static String informeel(String voornaam) {
        return "Dag " + voornaam;
    }

    private static String formeel(String familienaam, String titel) {
        return "Geachte " + titel + ' ' + familienaam;
    }
}
