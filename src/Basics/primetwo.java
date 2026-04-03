package Basics;
import java.util.Scanner;
public class primetwo{
    static void main(){
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i <= n-1; i++){
            if(n%i==0){
                flag = false;
            }
        }
        if(n==1)System.out.print("NEITHER PRIME NOR COMPOSITE NUMBER");
        if(flag==true) System.out.print("PRIME NUMBER");
        if(flag==false) System.out.print("COMPOSITE NUMBER");
    }
}