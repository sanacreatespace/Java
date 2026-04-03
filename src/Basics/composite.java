package Basics;
import java.util.Scanner;
public class composite{
    static void main(){
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        boolean flag = true; // prime number
        for(int i = 2; i <= x-1; i++) {
            if (x % i == 0) {
                flag = false; // composite number
                break;
            }
        }
        if(x == 1) System.out.println("Neither Prime nor Composite");
        if(flag == false) System.out.print("Composite Number");
        if(flag == true) System.out.print("PRIME NUMBER");
    }
}