package objectoriyent;

public class Paramiterized {
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
    void setinfo(String n, int a, String o, int i)
    {
        Name=n;
        age=a;
        proffession=o;
        id=i;
    }
    public static void main(String[] args) {
        Paramiterized pr= new Paramiterized();
        pr.setinfo("Mehedi", 20, "Student",9021);
        pr.display();
    }
}
