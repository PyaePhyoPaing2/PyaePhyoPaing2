package withi_ide;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input Your Lucky Number :");
        int i;
        i = sc.nextInt();
        if (i > 6){
            System.out.println(" above six score");
        }else if (i==5){
            System.out.println(" equals five ");
        }else if (i <5){
            System.out.println("number five below");
        }

    }
}
