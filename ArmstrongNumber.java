public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int count = 0;
        int sum = 0;

        // Counting the number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = n; // Reset temp to original value

        // Calculating sum of digits raised to the power of count
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp = temp / 10;
        }

        // Checking if the number is Armstrong
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
