package Basics;
import java.util.Scanner;
public class digitstwo{
    static void main(){
        System.out.print("Enter Number: ");
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.print(count);
    }
}