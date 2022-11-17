package lectureTask_25_06_2022;

import java.util.Scanner;

public class HexaToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String hex =scanner.nextLine();

         System.out.println(getDecimalWhitConversion(hex));
         System.out.println(getDecimalWhitRecursion(hex));

    }

    public static int getDecimalWhitConversion(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }
    public  static int getDecimalWhitRecursion( String hex){

        int decimal = 0;
        String hexCode = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int length = hex.length();
        if (length > 0) {
            char ch = hex.charAt(0);
            int digit = hexCode.indexOf(ch);
            String substring = hex.substring(1);
            decimal = digit * (int) Math.pow(16, length - 1) + getDecimalWhitRecursion(substring);
        }
        return decimal;
    }
}
