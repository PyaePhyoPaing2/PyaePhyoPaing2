package withi_ide;

public class Q13 {
    //method
    public static int remove(int array[], int n){
        int[] number = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (array[i] != array[i+1]){
                number[j++] = array[i];
            }
        }
        number[j++] = array[n-1];
        for (int i=0; i<j; i++){
            array[i] = number[i];
        }
        return j;
    }
    public static void main (String[] args) {
        int array[] = {1, 2, 3, 3, 4, 8, 6, 7, 9, 5, 9, 15, 11, 10, 4};
        int length = array.length;
        System.out.println("Array Before Removing Duplicates:");
        for (int i=0; i<length; i++)
            System.out.print(array[i]+" ");
        length = remove(array, length);
        System.out.println("\nArray After Removing Duplicates:");
        for (int i=0; i<length; i++)
            System.out.print(array[i]+" ");
    }
}
