//Given a number N, find the nearest greater multiple of 10.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int result=((num/10)+1)*10;
        System.out.println(result);
    }
}
