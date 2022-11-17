package homeWork_6.task_1b_Set;

import java.util.*;

public class MainSet {
//    Напишете пограма която:
//
//Чете от конзолата числа които са елементи на Set
//Извежда следната информация за Set-a: дължина, всички елементи несортирани, всички елементи сортирани
//Чете друго число от конзолата и го добавя към Set-a. Ако в Set-a има такова число вече
// (ползвайте факта, че методът за добавяне на елемент към Set-a връща false ако елементът не може да бъде добавен.)
// извежда съобщение “Такъв запис вече съществуваи не може да бъде добавен повторно.”
//Повторете стъпките 4, 5, 6 от задача 1.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // Integer[] num={121,9,66,15,58,23,47,5};
        Set<Integer> set = new HashSet<>();
        System.out.println("Въведете 7 числа: ");
        for (int i = 0; i < 7; i++) {

            int num= Integer.parseInt(scanner.nextLine());
            set.add(num);

        }
        Set<Integer> set1=new TreeSet<>(set);
        System.out.printf("Дължина: %d, всички елементи несортирани: %s, всички елементи сортирани: %s\n",set.size(),set,set1);
        System.out.println("Въведете число: ");
         int number=Integer.parseInt(scanner.nextLine());
        addNumber(set,set1, number);

        Set<Integer>set2=new TreeSet<>(new DescendingComparator());
        set2.addAll(set1);
        System.out.printf("Обръща елементите на списъка: %s -> %s\n",set1,set2);
        System.out.println("Чете елементите на втори сет: "+set2);
        compereSet(set1,set2);


    }

    private static void compereSet(Set<Integer> set1, Set<Integer> set2) {
        for (int i = 0; i < set1.size(); i++) {

            int number = (int) set1.toArray()[i];
            int number2=(int) set2.toArray()[i];
            if(number> number2){
                System.out.printf("Елемент %d от списък set1 е по-голям от елемент %d от списък set2.\n", number, number2);
            }
            else {
                System.out.printf("Елемент %d от списък set1 е по-малък от елемент %d от списък set2.\n",number, number2);
            }


        }
    }

    private static void addNumber(Set<Integer> set,Set<Integer>set1, int number) {
        if(set.contains(number)){
            System.out.println("Такъв запис вече съществуваи не може да бъде добавен повторно.");
        }
        else {
            set.add(number);
            set1.add(number);
            System.out.println("добавен елементите : "+number);
        }

    }

}
