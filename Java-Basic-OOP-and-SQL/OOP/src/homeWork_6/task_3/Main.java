package homeWork_6.task_3;

import java.util.*;

public class Main {

    //Напишете програма която:
    //
    //Чете два списъка от конзолата
    //Сортира ги
    //Обединява ги в един нов трети списък.
    //Трие дублицираните елементи (за да се премахнат дублицираните елементи може елементите от списъка да се добавят в един Set)
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(32);
        list1.add(456);
        list1.add(321);
        list1.add(22);
        list1.add(44);

        List<Integer> list2 = new ArrayList<>();
        list2.add(44);
        list2.add(78);
        list2.add(98);
        list2.add(858);
        list2.add(789);
        list2.add(456);
        list2.add(890);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("Sort list1:" + list1);
        System.out.println("Sort list2:" + list2);

        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("Обидинение:"+list1);

        Set<Integer> set = new TreeSet<>(list1);

        System.out.println("Премахнати дублицираните: "+set);


    }
}
