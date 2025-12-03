//Given a number N, print the odd digits in the number(space seperated) or print -1 if there is no odd digit in the given number.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt(); 
        String numStr = String.valueOf(num); 
        int length = numStr.length();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = numStr.charAt(i) - '0';
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < length; i++) {
            if(arr[i] % 2 != 0) {
                result.append(arr[i]).append(" ");
            }
        } 
        if (result.length() > 0) {
            System.out.println(result.toString().trim());
        } else {
            System.out.println("-1");
        }
    }
}
