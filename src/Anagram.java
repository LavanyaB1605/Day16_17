import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st word");
            String str1 = sc.nextLine();
            System.out.println("Enter 2nd word");
            String str2 = sc.nextLine();

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // check if length is same
            if(str1.length() == str2.length()) {

                // convert strings to char array
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                // sort the char array
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                boolean result = Arrays.equals(charArray1, charArray2);

                if(result) {
                    System.out.println(str1 + " and " + str2 + " are Anagram.");
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not Anagram.");
                }
            }
        }
    }
