package Newpkg;

//import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter how many integers you wnt to take:");
        int n=input.nextInt();
        int[] p= new int[n];
        for (int i = 0; i <n; i++) {
            p[i]= input.nextInt();
        }
        for (int i = 0; i <n; i++) {
            System.out.println(p[i]);
        }
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum=sum+p[i];
            
        }
        System.out.println(+sum);
        /*Arrays.sort(p);
        for (int i = 0; i <n; i++) {
            System.out.println(p[i]);
        }*/
        /*String s1=input.nextLine();
        StringBuffer st= new StringBuffer(s1);
        String s2= st.reverse().toString();
        if(s1.equals(s2))
            System.out.println("pal");
        else
            System.out.println("not");*/
    }
}
