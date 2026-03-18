import java.util.Scanner;

public class Lab3_Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // TASK 1: Days to weeks
        // =========================
        System.out.println("TASK 1: Days to Weeks Converter");

        while (true) {
            System.out.print("Enter number of days (non-positive to exit): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Exiting Task 1...");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days = " + weeks + " weeks and " + remainingDays + " days");
        }

        // =========================
        // TASK 2: Temperature converter
        // =========================
        System.out.println("\nTASK 2: Temperature Converter");

        while (true) {
            System.out.print("Enter temperature in Celsius (-1 to exit): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Exiting Task 2...");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsius: %.2f\n", celsius);
            System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
            System.out.printf("Kelvin: %.2f\n", kelvin);
        }

        scanner.close();
    }
}