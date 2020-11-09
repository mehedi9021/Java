package polymorphism;

public class Test {
    public static void main(String[] args) {
        person p1= new person();
        p1.display();
        p1=new Teacher();
       p1.display();
        p1= new Student();
        p1.display();
        
    }
}
