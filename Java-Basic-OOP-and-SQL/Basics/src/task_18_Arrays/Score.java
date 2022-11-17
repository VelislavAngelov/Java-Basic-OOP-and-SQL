package task_18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Score {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Моля въведете брой на играчите: ");
        int numOfGamers = Integer.parseInt(scanner.nextLine());
        double[] arr = new double[numOfGamers];
        double num;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;


        for (int i = 0; i < numOfGamers; i++) {

            System.out.printf("Въведете резултат №%d: ", i);
            num = Double.parseDouble(scanner.next());
            arr[i] = num;
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double avg = Arrays.stream(arr).sum() / 4;
        double stdDev = calculateStandardDeviation(arr);
        System.out.println();
        System.out.printf("Min      = %.3f\n", min);
        System.out.printf("Max      = %.3f\n", max);
        System.out.printf("Average  = %.3f\n", avg);
        System.out.printf("StdDev   = %.3f", stdDev);

    }

    public static double calculateStandardDeviation(double[] sd) {

        double sum = 0;
        double newSum = 0;
        double[] newArray = new double[10];

        for (int i = 0; i < sd.length; i++) {
            sum = sum + sd[i];
        }
        double mean = (sum) / (sd.length);

        for (int j = 0; j < sd.length; j++) {
            newArray[j] = ((sd[j] - mean) * (sd[j] - mean));
            newSum = newSum + newArray[j];
        }
        double squaredDiffMean = (newSum) / (sd.length);
        double standardDev = (Math.sqrt(squaredDiffMean));

        return standardDev;
    }
}
