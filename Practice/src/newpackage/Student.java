package newpackage;

public class Student extends Person{
    String cgpa;

    public Student(String C,String n, String p)
    {
        cgpa=C;
        name=n;
        phone=p;
        
    }
    public void dispaly1()
    {
       
        System.out.println(""+cgpa);
    }
}
    
    

