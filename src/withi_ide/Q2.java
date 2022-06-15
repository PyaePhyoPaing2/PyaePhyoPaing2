package withi_ide;

public class Q2 {
    static int a,b,c;
    public static void main(String[] args) {

        a = 5;
        b = 6;

        System.out.println( "Value of a :"+a);
        System.out.println("Value of b :"+b);
        c = b;// c =6
        b = a;// b= 5
        a = c;// a = 6
        System.out.println("Swap number");
        System.out.println( "Value of a :"+a);
        System.out.println("Value of b :"+b);
    }
}
