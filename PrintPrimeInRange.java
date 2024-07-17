import javax.swing.*;

public class PrintPrimeInRange {

    public static void main(String[] args) {
        int start = 2;
        int last = 100;
        for (int i = start; i <= last; i++) {
            boolean isPrime = true; // Assume i is prime initially
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    isPrime = false; // If divisible, not prime
                    break;
                }
            }
            // If isPrime is still true, then i is prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
