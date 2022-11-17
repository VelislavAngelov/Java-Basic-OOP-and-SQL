package lectureTask_23_06_2022;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int[] arr={5,8,15,44,-8,0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {

            int currentMin=arr[i];
            int index=i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]<currentMin){
                    currentMin=arr[j];
                    index=j;
                }
            }

            int temp=arr[i];
            arr[i]=currentMin;
            arr[index]=temp;
            System.out.println(Arrays.toString(arr));

        }

        System.out.println(Arrays.toString(arr));
    }

}
