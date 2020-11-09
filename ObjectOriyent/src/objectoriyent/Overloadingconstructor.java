package objectoriyent;

public class Overloadingconstructor {
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
    Overloadingconstructor(String w,  String j, int r)
    {
        Name =w;
        proffession= j;
        id= r;
    }
     Overloadingconstructor()
    {
        System.out.println("Nothing found");
    }
  
    Overloadingconstructor(String k, int l)
    {
        Name= k;
        age= l;
    }
    Overloadingconstructor(String n, int p, String k, int o)
    {
        Name=n;
        age=p;
        proffession= k;
         id= o;
    }
    public static void main(String[] args) {
        Overloadingconstructor pr= new Overloadingconstructor("Mehedi", 20, "Student",9021);
        pr.display();
        Overloadingconstructor pr1= new Overloadingconstructor("Mahin", 19);
        pr1.display();
        
        Overloadingconstructor pr3= new Overloadingconstructor("Bappy", "Student", 9999);
        pr3.display();
        Overloadingconstructor pr2= new Overloadingconstructor();//for default
    }
}
