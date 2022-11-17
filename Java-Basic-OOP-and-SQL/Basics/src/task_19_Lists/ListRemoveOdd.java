package task_19_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListRemoveOdd {

//Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
//Напишете програма, която да премахне всеки елемент на нечетна позиция от списъка.
// Внимавайте с for-a - ако махнете първият елемент - вторият ще стане първи.
//Може да почнете итерацията в обратен ред - отзад, напред

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 4, 6, 2, 10, 5));


        for (int i = myList.size() - 1; i >= 0; i--) {

            if (i % 2 == 0) {
                myList.remove(i);
            }

        }
        System.out.println(myList.toString());
    }
}
