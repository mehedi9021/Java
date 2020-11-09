package Newpkg;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n, i;
        System.out.println("Enter the number of integers:");
        n= input.nextInt();
        int[] a= new int[n];
        for (i=0;  i<n; i++)
        {
            a[i]=input.nextInt();     
        }
        System.out.println("Integers");
        for (i = 0; i <n; i++)
        {
            System.out.println(+a[i]);
        }
        Arrays.sort(a);
        System.out.println("Ascending order:");
        for (i = 0; i <n; i++)
        {
            System.out.println(+a[i]);
        }
        System.out.println("Descending order:");
        for (i=n-1; i>=0; i--)
        {
            System.out.println(+a[i]);
        }
            
    }
    
}
