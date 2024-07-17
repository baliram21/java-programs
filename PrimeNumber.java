import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int n=scanner.nextInt();
        isPrime(n);
    }

    private static void isPrime(int n) {

        for (int div=2; div*div<=n;div++){
            if (n%div==0){
                System.out.println("not prime");
            }else {
                System.out.println("prime");
            }

        }
    }
}
