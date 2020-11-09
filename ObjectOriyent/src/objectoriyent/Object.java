package objectoriyent;

public class Object {
    String Name;
    int age;
    String proffession;
    int id;
    String Versity;
    public static void main(String[] args) {
        Object ob= new Object();
        ob.Name="Mehedi";
        ob.age=20;
        ob.proffession= "Student";
        ob.id= 9021;
        ob.Versity="DIU";
        System.out.println(""+ob.Name);
        System.out.println(""+ob.age);
        System.out.println(""+ob.proffession);
        System.out.println(""+ob.id);
        System.out.println(""+ob.Versity);
    }
}
