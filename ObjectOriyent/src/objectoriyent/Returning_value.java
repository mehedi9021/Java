package objectoriyent;

public class Returning_value {
     int squre(int value)
        {
            return value*value;
        }
    public static void main(String[] args) {
       Returning_value p1= new Returning_value();
       p1.squre(5);
        System.out.println("Returning value:"+p1.squre(5));
       
    }
}
