package lectureTask_25_06_2022;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int binary = Integer.parseInt(scanner.nextLine());

        System.out.println(convertToBinaryWithRecursion(binary));
        System.out.println(convertToBinaryWithConversion(binary));

    }

    public static int convertToBinaryWithConversion(int binary) {

        int decValue = 0;

        // Инициализирането на основната стойност на 1, т.е. 8^0
        int base = 1;

        int temp = binary;
        while (temp > 0) {
            //Извличане на последната цифра
            int lastDigit = temp % 10;
            temp = temp / 10;

            // Умножаване на последната цифра с подходяща
            // основна стойност и добавянето й към dec_value
            decValue += lastDigit * base;

            base = base * 2;
        }
        return decValue;
    }
    public static int convertToBinaryWithRecursion(int binary) {
        if (binary == 0)
            return 0;
        else
            return (binary % 10 + 2 * convertToBinaryWithRecursion(binary / 10));
    }
}
