package Basics;
import java.util.Scanner;
public class numbersquare {
    static void main() {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
