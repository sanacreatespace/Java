package Practise;
import java.util.Scanner;
public class sumofdigits{
    public static void main(String[]args) {
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int x = 0;
        while (n!=0){
            x = x + (n%10);
            n = n/10;
        }
        System.out.println(x);
    }
}