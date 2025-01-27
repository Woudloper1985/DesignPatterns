package be.vdab.theorie.builder;

class CoordinaatMain {
    public static void main(String[] args) {
        var builder = new Coordinaat.CoordinaatBuilder();
        var coordinaat = builder.metX(5)
                .metY(4)
                .metZ(2)
                .maakCoordinaat();
        System.out.println(coordinaat);
    }
}