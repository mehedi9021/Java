package objectoriyent;

public class StaticMethood {
    static void display()
    {
        System.out.println("Name");
        System.out.println("Age");
        System.out.println("Information");
    }
    public static void main(String[] args) {      
     //no need to create object, direct call by class
     StaticMethood.display();
    }
}
