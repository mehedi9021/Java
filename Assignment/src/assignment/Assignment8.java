
package assignment;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
        int n, i, f=0;
        System.out.print("Enter integer:");
        n=input.nextInt();
        System.out.println("Number=" +n);
        //System.out.println("I=");
        for(i=2; i<=n-1; ++i)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
        
                
    }

    
    
}
