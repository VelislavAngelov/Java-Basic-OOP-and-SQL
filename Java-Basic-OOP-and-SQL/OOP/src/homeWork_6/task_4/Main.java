package homeWork_6.task_4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Напишете програма която:
    //
    //Чете елементите на един списък от конзолата
    //Извежда в конзолата двойките индекси (i, j)
    // на елементите които удовлетворяват следното условие: Ai*Aj<=max(Ai, Ai+1, … Aj), i<j
    //Например ако имаме списък с елементи 1 1 2 4 2 тогава очакваният изход е
    // (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 5)

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        inputList(list);
        int max;
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                max = getMax(list, i, j);
                if (list.get(i) * list.get(j) <= max) System.out.print("(" + (i + 1) + "," + (j + 1) + ")" + " ");
            }
        }

    }
    public static void inputList(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведи броя на числата:");
        int n = Integer.parseInt(scanner.nextLine());
        int number;
        for (int i = 0; i < n; i++) {
            System.out.println("Въведи число:");
            number = Integer.parseInt(scanner.nextLine());
            list.add(number);
        }
    }

    public static Integer getMax(List<Integer> list, int i, int j) {
        int max = list.get(i);
        for (int k = i + 1; k <= j; k++) {
            if (max < list.get(k)) max = list.get(k);
        }
        return max;
    }
}
