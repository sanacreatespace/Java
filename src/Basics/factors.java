package Basics;
import java.util.Scanner;
public class factors{
    static void main(){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        for(int i = 1; i <= s; i++){
            if(s % i == 0) System.out.print(i+" ");
        }
    }
}