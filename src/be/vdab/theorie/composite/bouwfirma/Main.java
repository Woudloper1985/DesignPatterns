package be.vdab.theorie.composite.bouwfirma;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
            var project = new Project();
            project.addKost(
                    new Grondstofkost(BigDecimal.valueOf(1_000), BigDecimal.valueOf(3)));
            project.addKost(
                    new Arbeidskost(BigDecimal.TEN, BigDecimal.valueOf(100)));
            var subProject = new Project();
            subProject.addKost(
                    new Grondstofkost(BigDecimal.valueOf(1_000), BigDecimal.valueOf(4)));
            subProject.addKost(
                    new Arbeidskost(BigDecimal.TEN, BigDecimal.valueOf(200)));
            project.addKost(subProject);
            System.out.println(project.getBedrag());
        }
    }

/*
var tekening = new Tekening();
        tekening.addKost(new Rechthoek(2,1));
        tekening.addKost(new Cirkel(3));
var subTekening = new Tekening();
        subTekening.addKost(new Rechthoek(3,2));
        subTekening.addKost(new Cirkel(4));
        tekening.addKost(subTekening);
        System.out.println(tekening.getOppervlakte());
        }
        }*/
