package withi_ide;

import java.util.Scanner;

public class Q1 {
// n! = n*(n-1)

    public static void main(String[] args) {
        int i ,n ,nf = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Input any number to find Factorial : ");
        n =sc.nextInt();
        for (i=1 ; i <= n; i++){
            nf = nf*i;
        }
        System.out.println("Factorial of "+n +" is : " + nf);
    }
}
