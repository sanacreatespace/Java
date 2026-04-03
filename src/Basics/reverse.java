package Basics;
import java.util.Scanner;
public class reverse {
    static void main(){
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n!=0){
            x = x*10;
            x = x + (n%10);
            n = n/10;
        }
        System.out.println(x);
    }
}
