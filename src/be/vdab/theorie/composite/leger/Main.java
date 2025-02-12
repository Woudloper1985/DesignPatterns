package be.vdab.theorie.composite.leger;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        var peloton1 = new Peloton(123);
        peloton1.add(new Soldaat("Jan"));
        peloton1.add(new Soldaat("Mieke"));
        var peloton2 = new Peloton(456);
        peloton2.add(new Soldaat("Piet"));
        peloton2.add(new Soldaat("Fatima"));
        var leger = new Leger();
        leger.add(peloton1);
        leger.add(peloton2);
        leger.trekTenStrijde();
    }
}
