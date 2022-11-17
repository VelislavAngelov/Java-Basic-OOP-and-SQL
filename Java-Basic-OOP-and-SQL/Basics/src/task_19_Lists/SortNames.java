package task_19_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {

//Напишете програма, която изисква от потребителя да въведе 3 имена от конзолата.
//След това, имената се сортират в азбучен ред и се отпечатват на екрана.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input;

        for (int i = 0; i < 3; i++) {

            input=scanner.nextLine();
            list.add(input);
        }
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
