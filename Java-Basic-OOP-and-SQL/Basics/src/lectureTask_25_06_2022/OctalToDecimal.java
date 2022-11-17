package lectureTask_25_06_2022;

import java.util.Scanner;

public class OctalToDecimal {
    static int sem = 0, decimal = 0, base = 1;
    ;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int octal = Integer.parseInt(scanner.nextLine());

        System.out.println(findDecimalWithRecursion(octal));
        System.out.println(findDecimalWithIterative(octal));

    }

    public static int findDecimalWithIterative(int octal) {

        int decValue = 0;

        // Инициализирането на основната стойност на 1, т.е. 8^0
        int base = 1;

        int temp = octal;
        while (temp > 0) {
            //Извличане на последната цифра
            int lastDigit = temp % 10;
            temp = temp / 10;

            // Умножаване на последната цифра с подходяща
            // основна стойност и добавянето й към dec_value
            decValue += lastDigit * base;

            base = base * 8;
        }
        return decValue;
    }

    public static int findDecimalWithRecursion(int octal) {

        if (octal != 0) {
            decimal = decimal + (octal % 10) * (base);
            base = base * 8;
            sem++;
            findDecimalWithRecursion(octal / 10);
        }
        return decimal;

    }

}
