package task_15_Cycles;

import java.util.Scanner;

public class ReverseNumber {

//Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.
//Ако числото е отрицателно - просто игнорирайте знака.
//Подсказка: Нека имаме числото 456.
//Ако вземем остатъка от делене на числото 456 на 10, ще получим 6
//Ако вземем остатъка от делене на числото 45 на 10, ще получим 5
//Ако вземем остатъка от делене на числото 4 на 10, ще получим 4
//Ако отпечатваме с print, вместо print всяка цифра, която отпечатваме, ще е на същият ред.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int reversed = 0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println(reversed);
    }


}
