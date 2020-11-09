package basicjava;

import java.util.Scanner;

public class UserOprtor {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num1, num2, sum;
        
        System.out.print("Enter First Number:");
        num1 = input.nextInt();
        System.out.print("Enter secound Number:");
        num2 = input.nextInt();
        
        sum=num1 + num2;
        
        System.out.print("Sum is: ");
        System.out.print(+sum);
        
        double div=(double) num1 / num2;
        System.out.println("\nDiv is:"+div);
        
    }
    
}
