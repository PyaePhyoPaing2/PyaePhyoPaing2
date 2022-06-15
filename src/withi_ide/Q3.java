package withi_ide;

public class Q3 {
    public static void main(String[] args) {
        int [] arrays = {23 ,24 ,12, 78, 62  };
        int largest = 0;
        for (int i = 0; i < arrays.length ; i++) {
            if(arrays[i]>largest){
               largest = arrays[i];
        }

        }System.out.println(largest);
    }
}

