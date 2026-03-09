import java.util.Scanner;

public class DemoTask {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Babazahid");
        String forename = scanner.nextLine();
        System.out.println("Zayidov");
        String surname = scanner.nextLine();
        scanner.close();
        System.out.println("Welcome" + forename + " " + surname);
 
    }

}