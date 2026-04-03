package Practise;
import java.util.Scanner;
public class reverse{
    static void main(){
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r = 0;
        while(n!=0){
            r = r*10;
            r = r + (n%10);
            n = n/10;
        }
        System.out.println(r);
    }
}