package be.vdab.theorie.adapter;

public class SpellingsControleAdapter {
    private String taal;
    private String tekst;

    public void setTaal(String taal) {
        this.taal = taal;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    /*String[] controleerSpellingEnGeefFouten(){
        return new NieuweSpellingsControle(taal, tekst).geefFouten();
    }*/

}
