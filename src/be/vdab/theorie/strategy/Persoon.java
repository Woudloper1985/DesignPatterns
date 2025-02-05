package be.vdab.theorie.strategy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persoon {
    private final String voornaam;
    private final String familienaam;
    private final String titel;

    public Persoon(String voornaam, String familienaam, String titel) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.titel = titel;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getTitel() {
        return titel;
    }

    String maakBriefHoofding(AansprekingAlgoritme algoritme) {
        var vandaag = LocalDate.now();
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        return new StringBuilder().append("Brussel, ")
                .append(formatter.format(vandaag))
                .append("\n").append(algoritme.getAanspreking(this))
                .append("\n").toString(); //de return-waarde van deze method moet String zijn.
    }
}
