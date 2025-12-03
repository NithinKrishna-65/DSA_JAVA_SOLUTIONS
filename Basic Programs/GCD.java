//Given 2 numbers N,M find the GCD of N and M.If it cannot be found for given number(s) then print -1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();     
        if (N == 0 || M == 0) {
            System.out.println(-1);
            return;
        }
        N = Math.abs(N);
        M = Math.abs(M);
        while (M != 0) {
            int temp = M;
            M = N % M;
            N = temp;
        }

        System.out.println(N);
    }
}
