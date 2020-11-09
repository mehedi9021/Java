package practice;

public class Apollo extends Craft implements Drive, Shuffle {
    int wheel;
    public Apollo(int a)
    {
        super("11022");
        wheel=a;
    
    }

    public int getWheel() {
        return wheel;
    }

 
    
    public void drive()
    {
          System.out.println("Drive");    
    }
    public void stop()
    {
          System.out.println("stop");    
    }
    public void turn()
    {
          System.out.println("Turn");    
    }
    public void startShuffle()
    {
          System.out.println("startShuffle");    
    }
    public void stopShuffle()
    {
          System.out.println("stopShuffle");    
    }
    public static void main(String[] args) {
        Apollo aa=new Apollo('4');
        System.out.println("Wheel: "+aa.getWheel());
        aa.display();
        
        aa.drive();
        aa.stop();
        aa.turn();
        aa.startShuffle();
        aa.stopShuffle();
        
    }
}
