import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);  //object
        int N = obj.nextInt();
        int M = obj.nextInt();
        int sum=N+M;
        
        if(sum%2==0){
        
        System.out.println("even");
            
        }
        else{
              System.out.println("odd");
        }
    }
}