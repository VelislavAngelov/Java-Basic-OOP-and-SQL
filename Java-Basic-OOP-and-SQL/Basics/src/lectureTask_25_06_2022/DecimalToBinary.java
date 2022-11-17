package lectureTask_25_06_2022;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        System.out.println(findBinaryWithRecursion(decimal));
        System.out.println(findBinaryWithIterative(decimal));

    }

    public static int findBinaryWithRecursion(int decimal) {

        if (decimal == 0) {
            return 0;
        }
        return decimal % 2 + 10 * (findBinaryWithRecursion(decimal / 2));
    }
    public  static  int findBinaryWithIterative(int decimal){

        int binaryNumber = 0;
        int remainder, i = 1;

        while (decimal!=0) {
            remainder = decimal % 2;
            decimal /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }

        return  binaryNumber;

    }

}
