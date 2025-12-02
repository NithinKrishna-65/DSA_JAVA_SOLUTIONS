// Custom logic to reverse a list manually (or) Reverses the list using Collections utility
    
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    // Using Collections
    public static void reorderList(List<Integer> list) {
        Collections.reverse(list);
    }
    // Mannual Method
    public static void reorderListCustom(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = obj.nextInt();
        for(int i=0;i<num;i++){
            list.add(obj.nextInt());
        }
        System.out.println("Original List: " + list);
        System.out.println("reversing the List using Mannual method");
        reorderListCustom(list);
        System.out.println("Reordered List: " + list);
        System.out.println("Using Collections");
        System.out.println("Reordered List: " + list);
    }
}
