package lectureTask_28_06_2022;

import java.util.Arrays;
import java.util.Random;

public class MurdgeSort {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random gen = new Random();
        for(int i = 0; i<arr.length; i++) {
            arr[i]=gen.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length+arr2.length];
        int index = 0, index1 = 0, index2 = 0;
        while(index1<arr1.length||index2<arr2.length) {
            if(index1<arr1.length && index2<arr2.length) {
                if(arr1[index1]<=arr2[index2]) {
                    result[index++]=arr1[index1++];
                }else {
                    result[index++]=arr2[index2++];
                }
            }else if(index1<arr1.length) {
                result[index++]=arr1[index1++];
            }else {
                result[index++]=arr2[index2++];
            }
            //1 2 3 4 7 - 5 6 8 9
            //1 2 3 4 5 6 7 8 9
        }
        return result;
    }
    private static int[] mergeSort(int[] arr) {
        if(arr.length<=1) {
            //System.out.println(Arrays.toString(arr));
            return arr;
        }
        int len1, len2;
        if(arr.length%2 == 0) {
            len1 = len2 = arr.length/2;
        }else {
            len1 = arr.length/2 + 1;
            len2 = arr.length/2;
        }
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        for(int i=len1, j = 0;i<arr.length;i++,j++) {
            arr2[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return merge(arr1,arr2);
    }
    //Изход в лабиринт
    //N царици
    //Судоку
}
