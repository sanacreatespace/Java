package Basics;
import java.util.Scanner;
public class divisible {
    static void main(){
        System.out.print("Enter number: ");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if(x % 5 == 0 || x % 3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}