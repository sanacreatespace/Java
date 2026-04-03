package Basics;
import java.util.Scanner;
public class prime{
    static void main(){
            System.out.print("Enter Number: ");
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            boolean x = true; //prime
            for(int i = 2; i<=n-1; i++){
                if(n % i == 0){
                    x = false; //composite
                    break;
                }
            }
            if(n == 1) System.out.println("Neither Prime Nor Composite");
            if(x == true) System.out.println("PRIME");
            if(x == false) System.out.println("COMPOSITE");
    }
}
