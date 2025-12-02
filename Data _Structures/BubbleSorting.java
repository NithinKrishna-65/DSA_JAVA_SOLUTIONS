import java.util.Arrays;
import java.util.Scanner;
public class Main{
	    static void bubbleSort(int arr[], int n){
	        int r, c, temp;
	        for (r = 0; r < n - 1; r++) {
	            for (c = 0; c < n - r - 1; c++) {
	                if (arr[c] > arr[c + 1]) {
                        temp = arr[c];
	                    arr[c] = arr[c + 1];
	                    arr[c + 1] = temp;
	                }
	            }
	        }
	    }
	
	    static void printArray(int arr[], int size){
	        System.out.println(Arrays.toString(arr));
	    }
	
	    public static void main(String args[]){
	        Scanner ob = new Scanner(System.in);
			System.out.println("Enter the size of array");
            int N=ob.nextInt();
            int [] arr= new int[N];
            for(int i=0;i<arr.length;i++){
                arr[i]=ob.nextInt();
            }
	        int n = arr.length;
	        bubbleSort(arr, n);
	        System.out.println("Sorted array : ");
	        printArray(arr, n);
	    }
	}
