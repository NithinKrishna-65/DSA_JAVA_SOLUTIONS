// Given a number N, find the factorial of N.

import java.util.*;
public class Factorial {
    static int FindFactorial(int n)
    {
        if (n<=1)
            return 1;

        return n * FindFactorial(n - 1);
    }

    // main method
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter value : ");
        int num = obj.nextInt();
        int result = FindFactorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }
}