package objectoriyent;

public class Methood {
    String Name;
    int age;
    String proffession;
    int id;
     public void display()
    {
        System.out.println(""+Name);
        System.out.println(""+age);
        System.out.println(""+proffession);
        System.out.println(""+id);
    }
    public static void main(String[] args) {
        Methood mm= new Methood();
        mm.Name="Mehedi";
        mm.age= 20;
        mm.proffession="Student";
        mm.id=9021;
        mm.display();
        Methood mm1= new Methood();
        mm1.Name="opsup";
        mm1.age=20;
        mm1.proffession="Student";
        mm1.id=9021;
        mm1.display();
    }
}
