package be.vdab.theorie.adapter;

public class Main {
    public static void main(String[] args) {
        var controle = new SpellingsControleAdapter();
        controle.setTaal("nl");
        controle.setTekst("Ik kom onmidelijk met een paralelogram.");
        for (var fout : controle.controleerSpellingEnGeefFouten()){
            System.out.println(fout);
        }
    }
}
