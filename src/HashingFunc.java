import java.util.Scanner;

public class HashingFunc {
    OrderedList<Integer> list[] = new OrderedList[11];

    public HashingFunc() {
        for (int i = 0; i < list.length; i++) {
            list[i] = new OrderedList<>();
        }
    }

    void put(int n) {
        list[n % 11].add(n);
    }

    boolean search(int n) {
        return list[n % 11].search(n);
    }

    public static void main(String[] args) {
        HashingFunc hf = new HashingFunc();
        OrderedList<Integer> ll = new OrderedList<>();
        System.out.println("no of elements to add");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            ll.add(s.nextInt());
        }

    }
}
