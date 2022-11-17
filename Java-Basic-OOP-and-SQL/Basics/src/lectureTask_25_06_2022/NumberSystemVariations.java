package lectureTask_25_06_2022;

import java.util.Scanner;

public class NumberSystemVariations {

    public static int[] arr;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Изберете бройна система: ");
        int base = scanner.nextInt();

        System.out.print("Изберете брой цифри: ");
        int digits = scanner.nextInt();

        arr = new int[digits];

        variation(0, base);

    }

    public static void variation(int index, int base) {

        if (index == arr.length) {//1111

            printArr();

        } else {
            for (int i = 0; i < base; i++) {

                arr[index] = i;

                variation(index + 1, base);
               // System.out.println("Връщаме се");
            }
        }
    }

    public static void printArr() {

        for (int j : arr) {

            System.out.print(j + " ");
        }
        System.out.println();
    }

}
