package basicjava;
public class MyHumpty {
    public static void main(String[] args) {
        int[]x= {17, 16, 15, 14, 13, 12, 11};
        int humpty=0;
        for (int i = 0; i <x.length-1; i++) {
            System.out.println("x["+i+"]="+x[i]+i);
            if (x[i]>x[i+1]) {
                humpty=x[i];
            }
            System.out.println(""+humpty);
        }
    }
}
