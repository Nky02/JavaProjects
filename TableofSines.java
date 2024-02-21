public class TableofSines {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%6s    %10s%n", "angle", "sine");
        System.out.printf("%6s    %10s%n", "-----", "--------");

        // Loop through the range -90 to 90 in increments of 15
        for (int angle = -90; angle <= 90; angle += 15) {
            // Convert angle to radians for the Math.sin function
            double radians = Math.toRadians(angle);
            // Calculate the sine
            double sineValue = Math.sin(radians);

            // Special case for zero degrees to align decimal points
            if (angle == 0) {
                System.out.printf("%6.1f    %9.6f%n", (double) angle, sineValue);
            } else {
                System.out.printf("%6.1f    %10.6f%n", (double) angle, sineValue);
            }
        }
    }
}