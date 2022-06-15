package withi_ide;

public class Q10 {
    public static void main(String[] args) {

        int [] array = new int [] {5, 4, 1,8, 6,9};
        int ii= 0;
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    ii = array[i];
                    array[i] = array[j];
                    array[j] = ii;
                }
            }
        }

        System.out.println();
        System.out.print("Decreasing array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
