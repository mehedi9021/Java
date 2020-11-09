package Newpkg;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter how many integers:");
        int n= input.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i <n; i++) {
            System.out.println(+a[i]);
        }
        int sum=0;
        System.out.println("Sum of arrays:");
        for (int i = 0; i < n; i++) {
            sum=sum+a[i];
        }
        System.out.println(+sum);
    }
}
