package withi_ide;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write Weekday and Weekelyday. I will tell  you  as a Japanese language :");
        String day = sc.nextLine();
        switch (day){
            case "Monday":
                System.out.println("At Japanese \'Getsu You BI \'");
                break;
            case "Tuesday":
                System.out.println("At Japanese \'Ka YOu Bi \'");
                break;
            case "Wednesday":
                System.out.println("At Japanese \'Sui You Bi\'");
                break;
            case "Thursday":
                System.out.println("At Japanese \'Moku You Bi \'");
                break;
            case "Friday":
                System.out.println("At Japanese \'Kin You BI \'");
                break;
            case "Saturday":
                System.out.println("At Japanese \'Do You Bi \'");
                break;
            case "Sunday":
                System.out.println("At Japanese \'NiChi You Bi\'");
                break;





        }
    }
}
