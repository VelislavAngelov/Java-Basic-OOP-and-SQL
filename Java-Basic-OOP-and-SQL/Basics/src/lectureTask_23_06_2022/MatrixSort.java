package lectureTask_23_06_2022;

public class MatrixSort {

    public static void main(String[] args) {
        int[] arr = {3, 10,11, 7, 2, 2, 5, 6, 7, 8,9, 3, 0, 0, 1, 5, 6,7,8,9,10,12,15,16,18};
        int maxCount = 0;
        int counter = 1;
        int index=0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                counter++;
                if (counter > maxCount) {
                    maxCount = counter;
                    index=i+1;
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(maxCount);
        System.out.println(index);
        for (int i = index-maxCount+1; i <= index; i++) {

            System.out.print(arr[i]+" ");
        }
    }
}
