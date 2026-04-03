package Basics;
import java.util.Scanner;
public class basicloop{
    static void main(){
        System.out.print("Enter Number: ");
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        for(int i = 1; i <= a; i++){
            System.out.print("Sana ");
        }
    }
}
