package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class ToBinary {

//Нека потребителят въведе цяло положително число.
//
//Тогава, използвайки цикъл, преобразувайте числото в двоичен вид и го разпечатайте на екрана, започвайки отзад напред.
//
//Например: числото 10 в двоичен вид е 1010. Вие обаче трябва да отпечатате 0101.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num= Integer.parseInt(scanner.nextLine());

         sb.append(Integer.toString(num,2));

        System.out.println(sb.reverse());
    }
}
