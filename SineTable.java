import java.text.DecimalFormat;

public class SineTable {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(" 0.0");
        DecimalFormat dfSin = new DecimalFormat(" 0.000000");

        System.out.println("angle      sine");
        System.out.println("-----    --------");

        double angle;
        double sine;

        angle = -90.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %.5s%n", df.format(angle), dfSin.format(sine));

        angle = -75.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = -60.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = -45.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = -30.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %.5s%n", df.format(angle), dfSin.format(sine));

        angle = -15.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = 0.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %.4s%n", df.format(angle), dfSin.format(sine));

        angle = 15.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = 30.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %.4s%n", df.format(angle), dfSin.format(sine));

        angle = 45.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = 60.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = 75.0;
        sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%s    %s%n", df.format(angle), dfSin.format(sine));

        angle = 90.0;
        sine = Math.sin(Math.toRadians(angle));
        // Special case for aligning zero degrees
        if (angle == 0.0) {
            System.out.printf("%s     %s%n", df.format(angle), dfSin.format(sine));
        } else {
            System.out.printf("%s    %.4s%n", df.format(angle), dfSin.format(sine));
        }
    }
}