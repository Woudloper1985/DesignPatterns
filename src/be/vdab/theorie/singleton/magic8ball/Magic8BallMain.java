package be.vdab.theorie.singleton.magic8ball;

import java.util.Scanner;

public class Magic8BallMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String vraag;

        do {
            System.out.println("Stel een vraag (typ \"stop\" om te stoppen):");
            vraag = scanner.nextLine();
            Magic8Ball.INSTANCE.geefAntwoord(vraag);
        } while (!vraag.equals("stop"));
    }
}
