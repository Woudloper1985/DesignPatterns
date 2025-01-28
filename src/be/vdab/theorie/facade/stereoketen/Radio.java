package be.vdab.theorie.facade.stereoketen;

class Radio implements Geluidsbron {
    @Override
    public void start() {
        System.out.println("radio gestart");
    }

    @Override
    public void stop() {
        System.out.println("radio gestopt");
    }
}