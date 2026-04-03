package Basics;
import java.util.Scanner;
public class digitsofnumber{
    static void main(){
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println("The Number of Digits are: "+ count);
    }
}