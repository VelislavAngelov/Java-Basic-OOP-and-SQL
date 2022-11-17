package task_19_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindListElement {

//Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
//Напишете програма, която очаква потребителя да въведе число и след това намира на кой индекс се намира това число в даденият масив.
//Ако числото не е в списъка, нека програмата отпечата -1.
//Вижте метода ArrayList.indexOf()
//Помните ли задачата FindElementIndex ? Сравнете леснотата на работа с масиви спрямо списъци.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 2, 10, 5));
        int num =Integer.parseInt(scanner.nextLine());
        boolean print =false;
        int index =0;

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).equals(num)){

                print=true;
                index=list.lastIndexOf(num);
                break;
            }

        }
        System.out.println(print?index:-1);
    }
}
