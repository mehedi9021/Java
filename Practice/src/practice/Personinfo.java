
package practice;

public class Personinfo {
    String name;
    int age;
    Address address;
    Personinfo(String Name, int Age , Address c)
    {
        name=Name;
        age=Age;
        address=c;
        
    }
    public static void main(String[] args) {
        Address a=new Address("Dhaka", "Bangladesh");
        Personinfo p=new Personinfo("Mehedi", 20, a);
        System.out.println(""+p.name);
        System.out.println(""+p.age);
        System.out.println(""+p. address.city);
        System.out.println(""+p.address.country);
      
    }
}
