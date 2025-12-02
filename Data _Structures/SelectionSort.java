import java.util.Scanner;
import java.util.Arrays;
public class Main{
public static void SelectionSort(int[] data) {
	int num=data.length;
	for(int i=0; i<num-1; i++) {
		int minindex=i;
		for(int j=i+1; j<num; j++) {
			if (data[j]<data[minindex]) {
				minindex=j;
			}
		}
		int temp=data[i];
		data[i]=data[minindex];
		data[minindex]=temp;
	}
}

public static void printArray(int[] val) {
	System.out.println("Sorted Array : "+Arrays.toString(val));
}
public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter the size of array: ");
	int N=ob.nextInt();
	System.out.println("Enter Elements");
	int [] arr= new int[N];
	for(int i=0; i<arr.length; i++) {
		arr[i]=ob.nextInt();
	}
	SelectionSort(arr);
	printArray(arr);
}
}
