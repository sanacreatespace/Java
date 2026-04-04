package Basics;
import java.util.Scanner;
public class factorial {
    static void main() {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = 1;
        for(int i = 1; i<=n; i++){
            x = x * i;
        }
        System.out.println(x);
    }
}
