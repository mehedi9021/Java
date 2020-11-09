package Newpkg;

import java.util.Scanner;


public class Array {
    
     public static void main(String args[]) {
       Scanner input= new Scanner(System.in);
       int n, i;
       System.out.println("Enter n:");
       n= input.nextInt();
       int[] a = new int[n];
       for (i=0; i <n; i++) 
       {
            a[i]= input.nextInt();
       }
       System.out.println("Numbers:");
       for (i=0;i<n; i++)
       {
           
             System.out.println(+a[i]);
       }
       
            
     }
     
    
}
