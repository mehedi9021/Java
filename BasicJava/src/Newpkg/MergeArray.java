
package Newpkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MergeArray {
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int[] a= new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i <n; i++) {
            System.out.println(+a[i]);
        }
        int p=input.nextInt();
        int[] b= new int[p];
        for (int i = 0; i <p; i++) {
            b[i]=input.nextInt();
        }
        for (int i = 0; i <p; i++) {
            System.out.println(+b[i]);
        }
         int[] c =new int[a.length+b.length];
         int count=0;
         for(int i = 0; i<a.length; i++) { 
         c[i] = a[i];
         count++;
      } 
      for(int j = 0;j<b.length;j++) { 
         c[count++] = b[j];
      } 
      for(int i = 0;i<c.length;i++) 
          System.out.print(c[i]+" ");
    }
}
