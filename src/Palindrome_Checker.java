import java.util.Scanner;

public class Palindrome_Checker {
    public static boolean isPalindrome(String a) {
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.reverse();
        String data = stringBuilder.toString();
        if (a.equals(data)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "RADAR";
        System.out.println(Palindrome_Checker.isPalindrome(a));
    }
}
