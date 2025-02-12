package be.vdab.theorie.observer.brand;

public class Brandweerman implements Observer{
        private final int nummer;

        public Brandweerman(int naam) {
            this.nummer = naam;
        }

        @Override
        public void update(Brand brand) {
            System.out.println("Brandweerman " + nummer + ": BRAND --> BLUSSEN!!!");
        }
    }
