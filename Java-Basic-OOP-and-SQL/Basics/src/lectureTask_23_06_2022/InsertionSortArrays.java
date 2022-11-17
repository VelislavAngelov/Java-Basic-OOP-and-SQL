package lectureTask_23_06_2022;

import java.util.Arrays;

public class InsertionSortArrays {

    public static void main(String[] args) {

        int[] array = {9,14,3,2,43,11,58,22};
        System.out.println(Arrays.toString(array));
        System.out.println();


        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            System.out.println(Arrays.toString(array));
        }
      //  System.out.println(Arrays.toString(array));
    }
}
