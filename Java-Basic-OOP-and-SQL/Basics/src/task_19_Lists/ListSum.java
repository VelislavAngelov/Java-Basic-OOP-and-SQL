package task_19_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSum {

//Напишете програма, която събира въведените от потребителя цели числа. Въвеждането продължава докато потребителя въведе 0.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int input;

        while (true) {
            input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            } else {
                list.add(input);
            }
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println(sum);
    }
}
