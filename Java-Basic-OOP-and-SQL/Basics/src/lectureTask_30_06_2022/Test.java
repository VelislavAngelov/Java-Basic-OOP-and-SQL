package lectureTask_30_06_2022;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num =Integer.parseInt(scanner.nextLine());

        getPositiveNegativeOrZero(num);

    }

    private static void getPositiveNegativeOrZero(int num) {

        if(num==0){
            System.out.println(0);
        }else {
            System.out.println(num>0?1:-1);
        }

    }
}
