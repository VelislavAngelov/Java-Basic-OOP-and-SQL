package task_17_FinalBasicsExercise;

import java.util.Scanner;

//Вашата програма очаква от потребителя да въведе число. След това отпечатва таблица за умножението
// на това число със всички числа от 1 до 10.
//Изхода на екрана трябва да е подобен на този даден в примера.
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45
//5 * 10 = 50
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i <= n ; i++) {

            for (int j = 1; j <= 10 ; j++) {

                System.out.printf("%d * %-1d = %-5d\n",i,j,(j*i));
            }
        }

    }
}
