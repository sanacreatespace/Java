package Basics;

import java.util.Scanner;
public class Input1 {
    static void main (){
        System.out.println("Enter Radius: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pie = 3.14;
        double area = pie * r * r;
        System.out.println(area);

    }
}
