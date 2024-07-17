public class PalindromeNumber {
    public static void main(String[] args) {
        int n=122321;
        int temp=n;
        int rev=0;

        while (temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp / 10;
        }
        System.out.println(rev);
        if (n==rev){
            System.out.println("number is pallindrome !!");
        }else {
            System.out.println("number is not pallindrome !!!!");
        }
    }
}
