import java.util.Scanner;

public class BalancedParanthesis {
    static boolean check(String s) {
        StackProb5 st = new StackProb5();
        for (int i = 0; i < s.length(); i++) {
            /*
             * push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the
             * Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
             */
            char c = s.charAt(i);
            if (c == '(')
                st.push(s.charAt(i));
            else if (c == ')')
                st.pop();
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Expression");
        String s = sc.nextLine();
        String result = (check(s)) ? "Balanced" : "Not Balanced";
        System.out.println(result);
    }
}
