public class StringPalindrome {
    public static void main(String[] args) {
        String str = "nayan";
        String rev = "";

        // Reversing the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if the original string is equal to the reversed string
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome string.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
