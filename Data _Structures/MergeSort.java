import java.util.*;
public class Main {
    static void merge(int arr[], int LEFT, int MID, int RIGHT){
        int num1 = MID - LEFT + 1;
        int num2 = RIGHT - MID;
        
        int L[] = new int[num1];
        int R[] = new int[num2];
        
        for (int i = 0; i < num1; ++i){
            L[i] = arr[LEFT + i];
        }
        for (int j = 0; j < num2; ++j){
            R[j] = arr[MID + 1 + j];
        }
        int i = 0, j = 0;
        int k = LEFT;
        while (i < num1 && j < num2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < num1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < num2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[], int left, int right){
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
        int N=ob.nextInt();
        System.out.println("Enter Elements");
        int [] arr= new int[N];
        for(int i=0;i<arr.length;i++){
                arr[i]=ob.nextInt();
            }
        mergeSort(arr, 0, arr.length - 1);
        int len = arr.length;
        System.out.print("Sorted Array : ");
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");
    }
}
