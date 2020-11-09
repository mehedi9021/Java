package objectoriyent;

public class defaultConstructor {
     String Name;
    int age;
    String proffession;
    int id;
    void display()
    {
        System.out.println(""+Name);
        System.out.println(""+age);
        System.out.println(""+proffession);
        System.out.println(""+id);
    }
    defaultConstructor()
    {
        System.out.println("Nothing found");
    }
    defaultConstructor(String n, int p, String k, int o)
    {
        Name=n;
        age=p;
        proffession= k;
         id= o;
    }
    public static void main(String[] args) {
        Constructor pr= new Constructor("Mehedi", 20, "Student",9021);
        pr.display();
        
    }
}
