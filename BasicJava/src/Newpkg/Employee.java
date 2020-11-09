package Newpkg;

public class Employee {
    public void name(String Name)
    {
        System.out.println("Name="+Name);
    }
    public void Id(int id)
    {
        System.out.println("Id="+id);
    }
    public void AgeSallary(int age, double sallary)
    {
        System.out.println("Age=" +age);
        System.out.println("Sallary=" +sallary);
    }
    public void Designation(String d)
    {
        System.out.println("Designation="+d);
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name("Mehedi");
        e1.Id(9021);
        e1.AgeSallary(20, 13.500);
        e1.Designation("B.Sc in CSE");
    }
}
