package homeWork_6.task_2a_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    //Напишете програма която:
    //
    //Чете два списъка от конзолата
    //Извежда в конзолата тяхното обидинение и сечение. Ползвайте ArrayList или LinkedList.

    public static void main(String[] args) {

        List<Integer>list1 = new ArrayList<>();
        list1.add(12);
        list1.add(32);
        list1.add(456);
        list1.add(321);
        list1.add(22);
        list1.add(44);

        List<Integer>list2 = new ArrayList<>();
        list2.add(55);
        list2.add(78);
        list2.add(98);
        list2.add(858);
        list2.add(789);
        list2.add(587);
        list2.add(890);
        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);


        list1.addAll(list2);
        System.out.println("Обидинение:"+list1);
        list1.removeAll(list2);
        System.out.println("Сечение: "+list1);
    }
}
