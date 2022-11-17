package homeWork_6.task_1a_List;

import java.util.*;

public class MainList {

    //Напишете пограма която:
    //
    //Чете от конзолата числа които са елементи на List
    //Извежда следната информация за списъка: дължина, всички елементи
    //Сортира списъка и извежда резултата
    //Обръща елементите на списъка (1 2 3 -> 3 2 1)
    //Чете елементите на втори списък.
    //Сравнява двата списъка елемент по елемент и на всяка итерация извежда следното съобщение
    // “Елемент N от списък 1 е по-малък/по-голям от елемент X от списък 2.”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Integer[] num={121,9,66,15,58,23,47,5};
        List<Integer> list1 = new ArrayList<>();

        System.out.println("Въведете 7 числа: ");
        for (int i = 0; i < 7; i++) {

            int num= Integer.parseInt(scanner.nextLine());
            list1.add(num);

        }

        System.out.printf("Size: %d, elements: %s\n",list1.size(),list1);
        Collections.sort(list1);
        System.out.println("SortedList: "+list1);

        List<Integer> list2=new ArrayList<>(list1);
        Collections.reverse(list2);
        System.out.printf("Обръща елементите на списъка: %s -> %s\n",list1,list2);
        System.out.println("Чете елементите на втори списък: "+list2);
        compereLists(list1, list2);


    }

    private static void compereLists(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {

            if(list1.get(i)> list2.get(i)){
                System.out.printf("Елемент %d от списък list1 е по-голям от елемент %d от списък list2.\n", list1.get(i), list2.get(i));
            }
            else {
                System.out.printf("Елемент %d от списък list1 е по-малък от елемент %d от списък list2.\n", list1.get(i), list2.get(i));
            }

        }
    }

}
