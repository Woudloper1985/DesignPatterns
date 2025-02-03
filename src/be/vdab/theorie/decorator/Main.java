package be.vdab.theorie.decorator;

public class Main {
    public static void main(String[] args) {
        var eenvoudig = new EenvoudigeKoffie();
        System.out.println((eenvoudig.getKost()));
        System.out.println(eenvoudig.getBereiding());
        System.out.println();
        var metMelk = new MetMelk (new EenvoudigeKoffie());
        System.out.println(metMelk.getKost());
        System.out.println(metMelk.getBereiding());
        System.out.println();
        var metChocolade = new MetChocolade(new EenvoudigeKoffie());
        System.out.println(metChocolade.getKost());
        System.out.println(metChocolade.getBereiding());
        System.out.println();
        var metMelkEnChocolade = new MetChocolade(new MetMelk(new EenvoudigeKoffie()));
        System.out.println(metMelkEnChocolade.getKost());
        System.out.println(metMelkEnChocolade.getBereiding());
    }
}

//Dynamische decoratie: een voorbeeld (op basis van invoer van de gebruiker):
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
    System.out.println(koffie.getBereiding());
}
}*/
