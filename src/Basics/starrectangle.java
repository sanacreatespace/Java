package Basics;
import java.util.Scanner;
public class starrectangle {
    static void main() {
        System.out.print("Enter Rows: ");
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        System.out.print("Enter Columns: ");
        int col = sc.nextInt();
        for(int i = 1; i<=row; i++) {
            for (int j = 1; j<=col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
