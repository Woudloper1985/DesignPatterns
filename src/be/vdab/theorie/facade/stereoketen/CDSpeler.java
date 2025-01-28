package be.vdab.theorie.facade.stereoketen;

class CDSpeler implements Geluidsbron{
    @Override
    public void start() {
        System.out.println("CD speler gestart");
    }
    @Override
    public void stop() {
        System.out.println("CD speler gestopt");
    }
}