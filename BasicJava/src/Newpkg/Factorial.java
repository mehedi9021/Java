package Newpkg;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     int q=factorial(n);
        System.out.println("Factorial:" +q);
     
    }
    public static int factorial(int p) {
        if(p==1)
        {
            return 1;
        }
        int output;
        output=factorial(p-1)*p;
        return output;
        
    }
}
