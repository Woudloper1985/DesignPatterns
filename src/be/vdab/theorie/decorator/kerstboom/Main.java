package be.vdab.theorie.decorator.kerstboom;

public class Main {
    public static void main(String[] args) {
        var kerstboom = new Spar();
        System.out.println();
        System.out.println(kerstboom.getInformatie());
        System.out.println();
        var metBallen = new MetBallen(new Spar());
        System.out.println(metBallen.getInformatie());
        System.out.println();
        var metLichtjes = new MetLichtjes(new Spar());
        System.out.println(metLichtjes.getInformatie());
        System.out.println();
        var metBallenEnLichtjes = new MetLichtjes(new MetBallen(new Spar()));
        System.out.println(metBallenEnLichtjes.getInformatie());

    }
}
