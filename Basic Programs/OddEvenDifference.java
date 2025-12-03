//Given 2 numbers N,M. Find their difference and check whether it is even or odd

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c=a-b;
        if(c%2==0){
            
        System.out.println("even");
        }
        else{
        System.out.println("odd");
    }
    }
}
