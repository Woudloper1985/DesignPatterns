package be.vdab.theorie.singleton.magic8ball;

import java.util.Random;

/* oplossing met return-waarden in de takenbundel voor geefAntwoord, pagina 7-8.
* Maar dan moet je altijd een sout typen in de main, hetgeen ik onhandig vind. */

public enum Magic8Ball {
    INSTANCE;
    private final String[] antwoordopties = {
            "• Zoals ik het zie, ja.\n",
            "• Het is zeker.\n",
            "• Hoogst waarschijnlijk.\n",
            "• Ziet er goed uit.\n",
            "• Zonder twijfel.\n",
            "• Ja.\n",
            "• Zeker.\n",
            "• Je mag er op rekenen.\n",
            "• Vraag dit later nog eens.\n",
            "• Dit wil je niet weten.\n",
            "• Ik kan dit nu niet voorspellen.\n",
            "• Concentreer je en stel je vraag opnieuw.\n",
            "• Je moet er niet op rekenen.\n",
            "• Nee.\n",
            "• Ziet er niet goed uit.\n",
            "• Zeer twijfelachtig.\n"
    };

    private String vorigAntwoord = "";

    void geefAntwoord(String vraag) {
        var random = new Random(); // maak een nieuwe randomgenerator
        var randomIndex = random.nextInt(antwoordopties.length); // Trek een willekeurige index uit de array
        var antwoord = antwoordopties[randomIndex];

        while (antwoord.equals(vorigAntwoord)) {
            randomIndex = random.nextInt(antwoordopties.length);
            antwoord = antwoordopties[randomIndex];
        }
        System.out.println(antwoord);
        vorigAntwoord = antwoord;
        }
    }

