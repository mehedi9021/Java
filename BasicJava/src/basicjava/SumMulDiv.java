
package basicjava;

import java.util.Scanner;

public class SumMulDiv {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        double A, B, Sum, Mul, Div, Sub;
        System.out.print("Enter the value of A:");
        A= input.nextInt();
        System.out.print("Enter the value of B:");
        B= input.nextInt();
        
        Sum= A + B;
        System.out.println("Sum is:" +Sum);
        Sub= A-B;
        System.out.println("Sub is:" +Sub);
        Mul = A*B;
        System.out.println("Mul is:" +Mul);
        Div=A/B;
        System.out.println("Div is:"+Div);
       
        
    }
        
    
}
