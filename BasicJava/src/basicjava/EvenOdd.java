package basicjava;

import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int A;
        System.out.print("Enter the value of A:");
        A= input.nextInt();
        if(A%2==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
    
}
