package Basics;
import java.util.Scanner;
public class powerloop {
    static void main() {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.print("Enter Power: ");
        int m = sc.nextInt();
        int x = 1;
        for(int i = 1; i<=m; i++){
            x *= n;
        }
        System.out.println(x);
    }
}
