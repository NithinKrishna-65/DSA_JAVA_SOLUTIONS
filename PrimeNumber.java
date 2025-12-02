// Problem Statement:
// Given a number N, check whether it is prime or not. Print 'yes' if it is prime else print 'no'.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean prime = true;
        if(N <= 1) {
            prime = false;
        }
        else {
            for(int i = 2; i <= N/2; i++) {
                if(N % i == 0) {
                    prime = false; 
                    break;
                }
            }
        }
        
        if(prime)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}