package be.vdab.theorie.decorator.vakantiepark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrangement arrangement = new EnkelBungalow();
        var scanner = new Scanner(System.in);
        System.out.println("Barbecue (j/n):");
        if ("j".equals(scanner.nextLine())) {
            arrangement = new MetBarbecue(arrangement);
        }
        System.out.println("Fietsen (j/n):");
        if ("j".equals(scanner.nextLine())){
            arrangement = new MetFietsen(arrangement);
        }
        System.out.println(arrangement.getTaken());
    }
}


/*
public static void main(String[] args) {
    Koffie koffie = new EenvoudigeKoffie();
    var scanner = new Scanner(System.in);
    System.out.print("Melk (j/n):");
    if ("j".equals(scanner.nextLine())) {
        koffie = new MetMelk(koffie);
    }
    System.out.print("Chocolade (j/n):");
    if ("j".equals(scanner.nextLine())) {
        koffie = new MetChocolade(koffie);
    }
    System.out.println(koffie.getKost());
    System.out.println(koffie.getBereiding());*/
