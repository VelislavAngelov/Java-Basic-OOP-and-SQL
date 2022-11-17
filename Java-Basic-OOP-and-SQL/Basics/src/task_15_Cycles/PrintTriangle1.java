package task_15_Cycles;

import java.util.Scanner;

public class PrintTriangle1 {
    //Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30]
    // и го печата на екрана така:
    //1 2 3 4 5
    //1 2 3 4
    //1 2 3
    //1 2
    //1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--) {

            for (int j = 1 ; j <= i; j++) {

                System.out.printf(j+" ");
            }
            System.out.println();
        }
    }
}
