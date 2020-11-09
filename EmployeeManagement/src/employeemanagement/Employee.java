package employeemanagement;

public class Employee {
    String name;
    int age;
    String email;
    double sallary;
    String type;
    Employee(String na, int a, String e, double s, String t)
    {
        name=na;
        age= a;
        email= e;
        sallary=s;
        type=t;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public double getSallary() {
        return sallary;
    }

    public String getType() {
        return type;
    }
    
}
