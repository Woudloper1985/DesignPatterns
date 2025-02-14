package be.vdab.theorie.eindtest_eiland;

public abstract class InwonerDecorator extends Inwoner {
    protected final Inwoner soortInwoner;

    public InwonerDecorator(Inwoner soortInwoner) {
        super(soortInwoner.getNaam(), soortInwoner.getSoort(),
                soortInwoner.getReactieBijUitbarsting(), soortInwoner.getBijStoppen());
        this.soortInwoner = soortInwoner;
    }

    @Override
    public void reageerOpUitbarsting() {
        soortInwoner.reageerOpUitbarsting();
    }

    @Override
    public void reageerOpStoppen() {
        soortInwoner.reageerOpStoppen();
    }
}