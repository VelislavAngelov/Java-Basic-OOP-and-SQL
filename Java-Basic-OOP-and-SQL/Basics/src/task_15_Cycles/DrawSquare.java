package task_15_Cycles;

import java.util.Scanner;

public class DrawSquare {

    //Направете програма, която очаква от потребителя да въведе размер на квадрат (0, 30] и го печата на екрана така:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
