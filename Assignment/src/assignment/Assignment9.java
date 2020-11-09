package assignment;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
        int c=0;
        int a= input.nextInt();
        int b=input.nextInt();
        for (int i =a; i<=b; i++) {
            System.out.println(""+i);
        }
        System.out.println(" ");
        for (int i = a; i <=b; i++) {
            if (i%2==0&& i%3==0) {
                System.out.println(""+i);
            }
        }
    }
}
