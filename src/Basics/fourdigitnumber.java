package Basics;
import java.util.Scanner;
public class fourdigitnumber {
    static void main() {
        int n = 999, m = 10000;
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>n && a<m) System.out.print("It is a four digit number");
        else System.out.print("It is not a four digit number");
    }
}