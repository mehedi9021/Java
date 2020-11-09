/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newpkg;

import java.util.Scanner;

/**
 *
 * @author Mahmud Mehedi
 */
public class EnterElement {
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=input.nextInt();
        int[] a=new int[n];
        System.out.println("Please enter elements...");
        for(int j=0;j<n;j++)
            a[j]=input.nextInt();
        System.out.println("Array elements are : ");
        for (int i=0;i<n;i++)
        System.out.println(+a[i]);
        
    }
}
