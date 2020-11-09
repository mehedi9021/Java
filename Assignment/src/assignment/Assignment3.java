package assignment;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a= input.nextInt();
    int b= input.nextInt();
    int c= input.nextInt();
    if (a>b&&a>c) 
    {
         System.out.printf("The heighest value=%d", a);
    }
    else if (b>a&&b>c) 
    {
        System.out.printf("The heighest value=%d", b);
   
    }
     else if (c>a&&c>b) 
    {
        System.out.printf("The heighest value=%d", c);
   
    }
   }
    
}
