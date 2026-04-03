package Practise;
import java.util.Scanner;
public class sumofdigitstwo{
    public static void main(String[]args){
        System.out.print("Enter number: ");
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int x = 0;
        while(n!=0){
            x += (n%10);
            n /= 10;
        }
        System.out.println(x);
    }
}