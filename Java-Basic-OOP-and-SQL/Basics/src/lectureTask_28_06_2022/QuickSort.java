package lectureTask_28_06_2022;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 40, 30, 90, 50, 60};

        System.out.println(Arrays.toString(arr));
        quickSorts(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
    private static void quickSorts(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);
        quickSorts(arr, lowIndex, leftPointer - 1);
        quickSorts(arr, leftPointer + 1, highIndex);
    }

    private static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}
