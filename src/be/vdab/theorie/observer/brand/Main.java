package be.vdab.theorie.observer.brand;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        var brand = new Brand();
        brand.addObserver(new Bewoner("Jan"));
        brand.addObserver(new Bewoner("Fatima"));
        brand.addObserver(new Brandweerman(123));
        brand.addObserver(new Brandweerman(456));
        brand.breekUit();
    }
}
