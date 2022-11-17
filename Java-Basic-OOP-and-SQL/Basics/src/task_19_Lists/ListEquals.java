package task_19_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListEquals {

//Създайте списък от цели числа със следните елементи: { 1, 10, 15 }
//Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в друг списък.
//Сверете дали елементите на въведения списък са същите като в първия и ако са, отпечатайте “true”, в противен случай - “false”.
//Кой метод трябва да използвате тук?

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,10,15));
        ArrayList<Integer> inList =new ArrayList<>();
        int num;

        for (int i = 0; i < myList.size(); i++) {
            num=Integer.parseInt(scanner.nextLine());
            inList.add(num);
        }
        boolean equals = myList.equals(inList);
        System.out.println(equals);

    }
}
