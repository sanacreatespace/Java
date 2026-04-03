package Practise;
import java.util.Scanner;
public class numberofdigits {
    static void main(){
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.print(count);
    }
}
