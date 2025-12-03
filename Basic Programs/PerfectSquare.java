//Given 2 numbers N,M. Print 'yes' if their product is a perfect square else print 'no'.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int pdt=num1*num2;
        int root=(int)Math.sqrt(pdt);
        if(root*root==pdt){
        System.out.println("yes");
            
        }
        else{
            System.out.println("no");
        }
    }
}
