package task_13_DataInputAndOutput;

import java.util.Scanner;

// Напишете програма, която чете 1 число от конзолата,
// изчислява му корен квадратен и отпечатва резултата на екрана с точност до 5-тия знак след запетаята.

public class InputAndSqrt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.5f",Math.sqrt(num));
    }
}