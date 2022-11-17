package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class DropSong {
//Направете програма, която очаква потребителят да въведе някакво число.
//След това ако числото се дели:
//на 3 - отпечатва “Пльок”
//на 5 - “Пляс”
//на 7 - “Пльос”
//Ако не се дели на нито едно от горните, се печата въведеното число.
// Въвеждането е в цикъл и продължава докато потребителят въведе числото 0.
//При 0 трябва да отпечатате “Пльок Пляс Пльос” - защото 0 се дели без остатък на всички числа.
//Примери: 28 се дели на 1, 2, 4, 7, 14, 28 - значи печатаме “Пльос”
// 30 се дели на 1, 2, 3, 5, 6, 10, 15, 30 - печатаме “Пльок Пляс”
// 34 се дели 1, 2, 17 и 34, така че просто отпечатваме “34”

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num;

        while (true) {

            num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                System.out.println("Пльок Пляс Пльос");
                break;
            }
            if(num % 3!=0 && num % 5 != 0 && num % 7 !=0){
                sb.append(num+" ");
            }else {
                if ((num % 3) == 0) {
                    sb.append("Пльок ");

                }
                if (num % 5 == 0) {
                    sb.append("Пляс ");
                }
                if (num % 7 == 0) {
                    sb.append("Пльос ");
                }
            }
            System.out.println(sb);
            int index = sb.length();
            sb.delete(0,index);
        }

    }

}
