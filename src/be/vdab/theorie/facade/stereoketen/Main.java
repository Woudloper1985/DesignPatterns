package be.vdab.theorie.facade.stereoketen;

class Main {
    public static void main(String[] args) {
        var stereoketen = new Stereoketen();
        stereoketen.start();
        stereoketen.startRadio();
        stereoketen.startCDSpeler();
        stereoketen.stop();
    }
}
