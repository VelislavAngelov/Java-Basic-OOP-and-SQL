package task_15_Cycles;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    //Направете програма Factorial, която изчислява факториел на положително число въведено от конзолата.
    //
    //Потребителят може да въведе невалидно число (нула или отрицателно). Искайте да въведе число, докато не въведе положително.
    //
    //Ако не си спомняте от математиката:
    //
    //Факториел на 3 = 3 * 2 * 1
    //Факториел на 50 = 50 * 49 * 48 … * 2 * 1

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int num=0;
        while (!(num > 0)) {
            num = Integer.parseInt(scanner.nextLine());
        }
        BigInteger factorial = BigInteger.valueOf(num);
        for (int i = num - 1; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
