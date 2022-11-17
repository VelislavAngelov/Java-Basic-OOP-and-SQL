package lectureTask_09_06_2022;

import java.util.Random;

public class PrimeNumber {
    //2. Изведете 10 случайно генерирани числа, които са прости.

    public static void main(String[] args) {

        Random random = new Random();

        int count = 0;

        while (true) {

            int input =77;// random.nextInt();
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
                System.out.println("Is not prime");
            }
            if (flag) {
                count++;
                System.out.println(input + " is a prime number.");
                if (count == 10) {
                    break;
                }

            }
        }
    }

}
