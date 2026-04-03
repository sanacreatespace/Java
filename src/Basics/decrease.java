package Basics;
import java.util.Scanner;
public class decrease{
    static void main(){
        System.out.print("Enter number: ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for(int i = a; i>=1; i--){
            System.out.println(i);
        }
    }
}