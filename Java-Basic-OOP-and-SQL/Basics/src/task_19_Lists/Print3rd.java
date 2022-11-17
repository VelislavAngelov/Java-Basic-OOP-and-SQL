package task_19_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Print3rd {

//Напишете програма, която изисква от потребителя да въвежда имена от конзолата,
// като въвеждането приключва, когато потребителя въведе точка (.).
//Отпечатайте 3-тото въведено име на екрана.
//Сортирайте списъка и отпечатайте сортирания списък.
//Какво ще направите ако няма 3ти елемент? Може би съобщение за грешка?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String input;
        String name = "";
        int count = 0;

        while (true) {

            input = scanner.next();
            if (input.equals(".")) {
                break;
            }

            list.add(input);
            count++;

            if (count == 3) {
                name = input;
            }
        }

        if (name.equals("")) {
            System.out.println("Invalid index");
        } else {
            System.out.println(name);
        }
        Collections.sort(list);
        System.out.println(list.toString());

    }
}
