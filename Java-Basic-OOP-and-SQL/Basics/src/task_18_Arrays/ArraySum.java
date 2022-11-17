package task_18_Arrays;

public class ArraySum {
//Напишете програма, която сумира елементите на масив от цели числа и отпечатва резултата на екрана.
//
//Инициализирайте масива със следните числа:
//
//-1
//10
//4.5
//15
//3.278

    public static void main(String[] args) {


        double[] arr = {-1, 10, 4.5, 15, 3.278};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        System.out.println(sum);
    }
}
