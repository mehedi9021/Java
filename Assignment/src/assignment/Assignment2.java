package assignment;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //char[] x=new char[5];
       // char x={char a, char e,char i,char o,  char u};
        char n=input.next().charAt(0);
        if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
        {
            System.out.printf("%c is VOWEL", n);
        }
        else
        {
            System.out.printf("%c is CONSONENT", n);
        }
     
        
    }
    
}
