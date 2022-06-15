package withi_ide;

import java.util.Scanner;

//switch case
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1 to 10 . I will tell  you  as a Japanese Number :");
         int i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("At Japanese Language number of " + i + " is Ichi");
                    break;
                case 2:
                    System.out.println("At Japanese Language number of " + i + " is Ni");
                    break;
                case 3:
                    System.out.println("At Japanese Language number of  " + i + " is San");
                    break;
                case 4:
                    System.out.println("At Japanese Language number of " + i + " is Yonn or Shi");
                    break;
                case 5:
                    System.out.println("At Japanese Language number of " + i + " is Go");
                    break;
                case 6:
                    System.out.println("At Japanese Language number of " + i + " is Roku");
                    break;
                case 7:
                    System.out.println("At Japanese Language number of " + i + " is Shichi or Nana");
                    break;
                case 8:
                    System.out.println("At Japanese Language number of " + i + " is Hachi");
                    break;
                case 9:
                    System.out.println("At Japanese Language number of " + i + " is Kyuu or KU");
                    break;
                case 10:
                    System.out.println("At Japanese Language number of " + i + " is Juu");
                    break;
            }
        }

}

