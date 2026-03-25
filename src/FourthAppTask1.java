import java.util.Scanner;

public class FourthAppTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İlk girişi alıyoruz
        System.out.print("Enter lower and upper integer limits: ");
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        // Üst limit alt limitten büyük olduğu sürece döngü devam eder
        while (upper > lower) {
            long sum = 0;

            // Alt limitten üst limite kadar olan sayıların karelerini hesapla
            for (int i = lower; i <= upper; i++) {
                sum += (long) i * i;
            }

            // Sonucu ekrana yazdır (Örnekteki formatta: karelerin değerlerini göstererek)
            System.out.printf("The sums of the squares from %d to %d is %d%n",
                    lower * lower, upper * upper, sum);

            // Bir sonraki set için tekrar girdi iste
            System.out.print("Enter next set of limits: ");
            lower = scanner.nextInt();
            upper = scanner.nextInt();
        }

        // Döngü bittiğinde (upper <= lower ise)
        System.out.println("Done");
        scanner.close();
    }
}