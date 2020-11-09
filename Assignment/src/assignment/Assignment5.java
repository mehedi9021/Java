package assignment;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double pi= 3.1416;
        double tri= 1%2*a*b;
        double cir= pi*c*c;
        double trap= (1%2*(a+b)*c);
        double sq= b*b;
        double rect= a*b;
        System.out.println("TRIANGLE :"+tri);
        System.out.println("CIRCLE :"+cir);
        System.out.println("TRAP :"+trap);
        System.out.println("SQURE :"+sq);
        System.out.println("RECTANGLE :"+rect);
        
    }
}
