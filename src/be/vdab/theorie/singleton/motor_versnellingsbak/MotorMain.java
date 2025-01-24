package be.vdab.theorie.singleton.motor_versnellingsbak;

public class MotorMain {
    public static void main(String[] args) {
        Motor.INSTANCE.start();
        stopDeAuto(); // zie de method onderaan.

        try {
            Versnellingsbak.INSTANCE.hoger();
            Versnellingsbak.INSTANCE.lager();
        } catch (
                VerkeerdeVersnellingException ex) {
            System.out.println("verkeerde versnelling");
        }
    }

    private static void stopDeAuto() {
        Motor.INSTANCE.stop();
    }
}
