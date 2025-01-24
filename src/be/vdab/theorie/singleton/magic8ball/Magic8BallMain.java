package be.vdab.theorie.singleton.magic8ball;

import java.util.Scanner;

public class Magic8BallMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Stel een vraag: ");
        Magic8Ball.INSTANCE.geefAntwoord(scanner.nextLine());
    }
}
