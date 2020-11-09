package Newpkg;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         String s1;
         System.out.println("Enter string:");
         s1= input.next();
         StringBuffer st= new StringBuffer(s1);
         String s2= st.reverse().toString();
         if (s1.equals(s2))
         {
             System.out.println("Pallindrom");
          }
         else
         {
             System.out.println("Not pallindrom");
         }
    }
    
}
