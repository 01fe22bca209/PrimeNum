import java.util.Scanner;
/**
 * The PrimeNum class checks for prime numbers within a given range and prints them.
 */
public class PrimeNum {
    // Method to check if a number is prime
    /**
     * The function prints all prime numbers up to a given number.
     * 
     * @param num The parameter "num" represents the number up to which we want to print prime numbers.
     */
    public static void printPrimeNumbers(int num) {
        if (num <= 1) {
            return;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return;
            }
        }
        System.out.print(num + " ");
    }
   // The `main` method is the entry point of the Java program. It is where the program starts
   // executing.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the ending range: ");
        int endRange = scanner.nextInt();

        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");
        for (int i = startRange; i <= endRange; i++) {
            printPrimeNumbers(i);
        }

        scanner.close();
    }
}
