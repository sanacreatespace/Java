package Methods;
import java.util.Scanner;
public class MaxNumber {
    public static void main(String[]args){
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("MAX = "+ Math.max(Math.max(a,b),c));
    }
}
