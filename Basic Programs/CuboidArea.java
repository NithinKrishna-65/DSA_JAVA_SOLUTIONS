//Write a program to calculate the total surface area and volume of cuboid.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int L = obj.nextInt();
        int B = obj.nextInt();
        int H = obj.nextInt();
        int TSA=2*((L*B)+(B*H)+(H*L));
        int volume=L*B*H;
        System.out.printf("%d %d",TSA,volume);
    }
}
