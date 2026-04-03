package Basics;
import java.util.Scanner;
public class table{
    static void main() {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(i*n+" ");
        }
    }
}
