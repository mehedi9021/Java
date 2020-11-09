package assignment;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int c=0;
        int a= input.nextInt();
        int b=input.nextInt();
        for (int i =a; i<=b; i++) {
            System.out.println(""+i);
        }
        System.out.println("Even numbers are:");
         for (int i =a; i<=b; i++) {
             if (i%2!=0) {
                 c++;
             }
         }
         System.out.println(""+c);
    }
}
