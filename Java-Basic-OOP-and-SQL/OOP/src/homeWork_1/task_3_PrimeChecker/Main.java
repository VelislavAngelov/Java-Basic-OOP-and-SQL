package homeWork_1.task_3_PrimeChecker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Напишете клас PrimeChecker който има метод checkPrime.
    //Напишете програма която чете от входа N nа брой числа и извежда в конзолата само простите. (N може да бъде първото въведено число)
    //Примерен вход: 3 (N) 5 (number 1) 6 (number 2) 7 (number 3)
    //Примерен изход: 5, 7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrimeChecker prime = new PrimeChecker();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            int num = Integer.parseInt(scanner.nextLine());
            if (prime.checkPrime(num)) {

                arrayList.add(num);
            }

        }
        System.out.println(arrayList);
    }
}
