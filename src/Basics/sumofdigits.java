package Basics;
import java.util.Scanner;
public class sumofdigits{
    static void main(){
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum = sum + (n%10);
           n = n/10;
        }
        System.out.println(sum);
    }
}