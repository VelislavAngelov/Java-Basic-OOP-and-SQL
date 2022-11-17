package task_19_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfCouples {

//Напишете програма, която изисква от потребителя да въвежда цели числа от конзолата и въвеждането продължава,
// докато въведе 0. (Игнорирайте нулата и не я слагайте в масива/списъка)
//След това потребителят трябва да въведе още едно число sum.
//Отпечатайте всички двойки числа от въведените преди това, чиято сума е равна на sum.
//Например, ако потребителят въведе числата [2, 3, 4, 5, 1] и след това въведе сумата 6, тогава трябва да отпечата:
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int input;

        while (true) {

            input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }
            list.add(input);
        }
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == sum) {

                    System.out.printf("%d %d\n", list.get(i), list.get(j));
                }
            }

        }

    }
}
