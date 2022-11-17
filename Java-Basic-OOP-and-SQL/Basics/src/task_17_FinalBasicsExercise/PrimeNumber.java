package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class PrimeNumber {

//Направете програма, която очаква от потребителя да въведе число.
// След това проверява дали числото е просто и отпечатва true, ако е, false, ако не е.
//Простото число може да се дели само на 1 и на себе си.
// Ако се дели на което и да е друго цяло число, тогава не е просто.
//Подсказка: ако имате числото 77, тогава то определено няма как да се дели на числото 38 (= 77 / 2) или по-голямо.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        boolean flag = true;

        if (input!=2 && input%2==0 ||input<=0){
            flag=false;
        } else {
            for (int i = 3; i <= Math.sqrt(input); i++) {

                if (input % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
