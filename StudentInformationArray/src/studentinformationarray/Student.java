package studentinformationarray;

import java.util.Scanner;

public class Student {
   
     String name;
     int id;
     int age;
     String dept;
    
    
    public Student(String n , int i, int a, String d)
    {
        name = n;
        id= i;
        age = a;
        dept= d;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public String getDept()
    {
        return dept;
    }
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int n = input.nextInt();
        int i;
        
         Student[] student = new Student [n];
        
        System.out.println("Enter Customer Information:");
        
        for( i = 0; i< n ; i++)
        {
            System.out.println("Please enter a name:");
            String name = input.next();         
            System.out.println("Please enter id:");
            int id= input.nextInt();
            System.out.println("Please enter age");
           int age= input.nextInt();
           System.out.println("Please enter Dept.:");
           String dept= input.nextLine();
            student [i] = new Student(name, id, age, dept);
        }
        System.out.println("The List of Students: ");
            for(i = 0 ; i< n ; i++ )
            {
                System.out.println("Name: "+ student [i].getName()+ 
                        "  Id: "+ student [i].getId()+ "Age"+student[i].getAge()+ "  Dept: "+ student[i].getDept());
            }
        
}
}
