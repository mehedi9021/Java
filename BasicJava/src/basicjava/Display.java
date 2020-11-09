package basicjava;
public class Display {
    void display(char c, int num)
    {
        System.out.println("ppppp");
    }
    void display(int num, char c)
    {
        System.out.println("qqqqq");
    }
    public static void main(String[] args) {
        Display ob= new Display();
        ob.display( 100, 'A');
        ob.display( 'B', 30);
    }
}
