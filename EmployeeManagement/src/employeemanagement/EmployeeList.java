package employeemanagement;

import java.util.Scanner;

public class EmployeeList {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i;
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!EMPLOYEE MANAGEMENT!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Enter the number of employee:");
        int n= input.nextInt();
        Employee[] L= new Employee[n];
        for ( i = 0; i <n; i++) {
            System.out.println("____________________________________________________________");
            input.nextLine();
            System.out.println("Name:");
            String na= input.nextLine();
            System.out.println("Age");
            int a= input.nextInt();
            input.nextLine();
            System.out.println("Email:");
            String e=input.nextLine();
            System.out.println("Sallary:");
            double s= input.nextDouble();
            input.nextLine();
            System.out.println("Type:");
            String t=input.nextLine();
            L[i]=new Employee(na, a, e ,s, t);
        }
        for (i= 0; i <n; i++) {
        System.out.println("____________________________________________________________");
        System.out.println("=>>");
        System.out.println("Name:"+L[i].getName());
        System.out.println("Age:"+L[i].getAge());
        System.out.println("Email:"+L[i].getEmail());
        System.out.println("Sallary:"+L[i].getSallary());
        System.out.println("Type:"+L[i].getType());
            System.out.println("____________________________________________________________");
        }
        int j;
        int flag=0;
        System.out.println("Enter name for search:");
        String src=input.nextLine();
        for (j= 0; j<n; j++) {
        if (src.equals(L[j].name)) {
            flag=1;
            break;
        }
        }
        if(flag==1)
        {
        System.out.println("____________________________________________________________");
        System.out.println("=>>");
        System.out.println("Name:"+L[j].getName());
        System.out.println("Age:"+L[j].getAge());
        System.out.println("Email:"+L[j].getEmail());
        System.out.println("Sallary:"+L[j].getSallary());
        System.out.println("Type:"+L[j].getType());
        System.out.println("____________________________________________________________");
        }
        else    
        {
            System.out.println("Sorry!! Not Found!!");
        }
        if (flag==1) 
        {
            System.out.println("Do you want to edit?? For edit press '1' else '0' ");
            System.out.println("____________________________________________________________");
            int R=input.nextInt();
            if (R==1) {
            input.nextLine();
            System.out.println("New name:");
            String z= input.nextLine();
            L[j].name=z;
            System.out.println("New age");
            int x= input.nextInt();
            input.nextLine();
            L[j].age=x;
            System.out.println("New email:");
            String m=input.nextLine();
            L[j].email=m;
            System.out.println("New sallary:");
            double u= input.nextDouble();
            input.nextLine();
            L[j].sallary=u;
            System.out.println("New type:");
            String q=input.nextLine(); 
            L[j].type=q;
            }
            else
            {
                System.out.println("____________________________________________________________");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NO NEED TO EDIT!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("____________________________________________________________");
            }
        }
        for (  i = 0; i <n; i++) {
            System.out.println("____________________________________________________________");
            System.out.println("Updated =>");
            System.out.println("Name:"+L[i].name);
            System.out.println("Age:"+L[i].age);
            System.out.println("Email:"+L[i].email);
            System.out.println("Sallary:"+L[i].sallary);
            System.out.println("Type:"+L[i].type);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!SUCCESSFULLY EDITED!!!!!!!!!!!!!!!!!!!!!!!1");
        }
    }
}
