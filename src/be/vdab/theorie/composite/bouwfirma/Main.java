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
        tekening.add(new Rechthoek(2,1));
        tekening.add(new Cirkel(3));
var subTekening = new Tekening();
        subTekening.add(new Rechthoek(3,2));
        subTekening.add(new Cirkel(4));
        tekening.add(subTekening);
        System.out.println(tekening.getOppervlakte());
        }
        }*/
