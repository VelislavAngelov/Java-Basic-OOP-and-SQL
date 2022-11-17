package task_15_Cycles;

import java.util.Scanner;

public class SumOfPositives {
    //Напишете програма, която събира въведените от потребителя числа, докато въведе 0 или отрицателно число.
    //
    //Нека всеки път преди потребителяt въведе число, да се отпечатва подканващ стринг "Въведете положително число: ".
    // Потребителят трябва да може да въведе числото на същият ред, а не на следващ.
    //Отпечатайте :
    //Сумата с точност до вторият знак след десетичната запетая.
    //Кое е най-голямото въведено число
    //Кое е най-малкото въведено число
    //Помислете кой цикъл е най-добре да използвате? while, do-while или for?

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double maxNum = Double.MIN_VALUE;
        double minNum = Double.MAX_VALUE;

        while (true){

            System.out.print("Въведете положително число: ");
            double num = Double.parseDouble(scanner.next());

            if(num <= 0){
                break;
            }
            sum += num;
            if(num < minNum){
                minNum = num;
            }
            if(num > maxNum ) {
                maxNum= num;
            }
        }
        System.out.printf("%.2f\n",sum);
        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
