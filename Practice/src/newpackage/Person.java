package newpackage;

public class Person {
    String name;
    String phone;
   public Person(String n, String p)
    {
        name=n;
        phone=p;
    }
    
    public void display()
    {
        System.out.println(""+name);
        System.out.println(""+phone);
    }
}
