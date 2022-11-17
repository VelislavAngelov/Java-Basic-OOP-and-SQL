package lectureTask_25_06_2022;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        System.out.println(findOctalWithRecursion(decimal));
        System.out.println(findOctalWithIterative(decimal));

    }
    public  static  int findOctalWithIterative(int decimal){

        int binaryNumber = 0;
        int remainder, i = 1;

        while (decimal!=0) {
            remainder = decimal % 8;
            decimal /= 8;
            binaryNumber += remainder * i;
            i *= 10;
        }

        return  binaryNumber;
    }
    public static int findOctalWithRecursion(int decimal) {

        if (decimal == 0) {
            return 0;
        }
        return decimal % 8 + 10 * (findOctalWithRecursion(decimal / 8));
    }

}
