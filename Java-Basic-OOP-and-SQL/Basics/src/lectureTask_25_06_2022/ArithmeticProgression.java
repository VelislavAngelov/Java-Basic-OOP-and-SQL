package lectureTask_25_06_2022;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        //A(n) = A(n-1) + p;
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());


        System.out.println(printArithmeticProgression(num, p));

    }

    public static String printArithmeticProgression(int num, int p) {

        if (num < 1) {
            return " ";
        }

        return num + " " + printArithmeticProgression(num - p, p);

    }

}
