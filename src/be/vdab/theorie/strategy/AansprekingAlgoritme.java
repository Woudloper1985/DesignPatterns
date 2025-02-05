package be.vdab.theorie.strategy;

@FunctionalInterface //i.e. exact één abstracte method
public interface AansprekingAlgoritme {
    String getAanspreking(Persoon persoon);
}
