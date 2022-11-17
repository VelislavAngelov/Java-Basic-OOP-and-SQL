package homeWork_6.task_2b_Set;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    //Напишете програма която:
    //
    //Чете два Set-a от конзолата
    //Извежда в конзолата тяхното обидинение и сечение.
    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2=new HashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        System.out.println(set1);
        System.out.println(set2);

        set1.addAll(set2);
        System.out.println("Обидинение:"+set1);
        set1.removeAll(set2);
        System.out.println("Сечение: "+set1);

    }
}
