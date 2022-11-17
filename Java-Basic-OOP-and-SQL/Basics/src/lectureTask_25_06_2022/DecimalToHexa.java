package lectureTask_25_06_2022;

import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(HexWithRecursion(num));
        System.out.println(HexaWithIterative(num));
    }

    private static String HexaWithIterative(int number) {
        StringBuilder builder = new StringBuilder();
        String hexCode = "0123456789ABCDEF";

        while (number > 0) {
            int hexDigit = number % 16;
            builder.append(hexCode.charAt(hexDigit));
            number /= 16;
        }
        return builder.reverse().toString();
    }

    private static String HexWithRecursion(int number){
        StringBuilder builder = new StringBuilder();
        if (number > 0) {
            String hexNumber = HexWithRecursion(number / 16);
            String hexCode = "0123456789ABCDEF";
            int hexDigit = number % 16;
            builder.append(hexNumber).append(hexCode.charAt(hexDigit));
        }
        return builder.toString();
    }

}
