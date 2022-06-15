package withi_ide;

public class Q24 {

    public static void main(String[] args) {
        int j[] =new int [6];
        for (int i = 0; i < j.length; i++) {
            for (int k = 1; k < j.length; k++) {
                System.out.print(j[i] + j[k] + "\t");
                if (i == k) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}

