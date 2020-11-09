package assignment;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int a= input.nextInt();
    int b=input.nextInt();
        if (a>b) {
            int p=a-b;
            System.out.println("A-B="+p);
        }
        else
        {
            int q=b-a;
            System.out.println("B-A="+q);
        }
    }
}
