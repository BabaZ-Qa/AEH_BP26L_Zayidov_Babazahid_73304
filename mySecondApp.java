import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        
        long seconds = (long) age * 365 * 24 * 60 * 60;

        
        System.out.println("My age in seconds: " + seconds);

        
        scanner.close();
    }
}