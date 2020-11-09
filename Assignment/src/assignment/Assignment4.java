package assignment;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n= input.nextInt();
        if (n>0) {
            System.out.printf("%d is a positive number.", n);
        }
        else
        {
            System.out.printf("%d is a negative number.", n);
        }
    }
    
}
