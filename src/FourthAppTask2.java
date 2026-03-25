import java.util.Scanner;

public class FourthAppTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        while (true) {

            System.out.println("\n--- Simple Calculator ---");
            System.out.println("a. Add      s. Subtract");
            System.out.println("m. Multiply d. Divide");
            System.out.println("q. Quit");
            System.out.print("Select an option: ");

            choice = scanner.next().toLowerCase().charAt(0);

            if (choice == 'q') {
                System.out.println("Exiting program...");
                break;
            }


            if (choice != 'a' && choice != 's' && choice != 'm' && choice != 'd') {
                System.out.println("Invalid option. Please try again.");
                continue;
            }


            double num1 = getValidNumber(scanner, "Enter first number: ");
            double num2 = getValidNumber(scanner, "Enter second number: ");


            switch (choice) {
                case 'a':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 's':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 'm':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 'd':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
            }
        }
        scanner.close();
    }


    private static double getValidNumber(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("That's not a valid number. Try again.");
                sc.next();
            }
        }
    }
}