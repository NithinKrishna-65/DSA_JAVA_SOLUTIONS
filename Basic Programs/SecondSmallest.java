//Given a number N followed by N elements, find the second smallest element.If it cannot be found then print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                if (n < 2) {
            System.out.println(-1);
            return;
        }
        long first = Long.MAX_VALUE;
        long second = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        if (second == Long.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(second);
    }
}
