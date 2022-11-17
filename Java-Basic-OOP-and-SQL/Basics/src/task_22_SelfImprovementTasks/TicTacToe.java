package task_22_SelfImprovementTasks;

import java.util.Scanner;

public class TicTacToe {

//Напишете програма, която позволява на 2ма играча да играят на играта tic-tac-toe. Нека при стартиране на играта, на екрана се показва:
//1 2 3
//4 5 6
//7 8 9
//След това програмата приканва играч 1 да избере позиция (от 1 до 9).
// Ако позицията е вече заета - играча трябва да въведе отново валидна/свободна позиция.
//
//При въвеждане на валидна позиция отново се отпечатва играта,
// но с отбелязан маркер (X за играч 1, и O за играч 2). Например, ако играч 1 въведе ‘3’, тогава отпечатваме:
//1 2 X
//4 5 6
//7 8 9
//Ако след текущият ход, играча е направил цял ред, цяла колона, или цял диагонал,
// тогава програмата изписва “Победа!” и прекъсва изпълнението си.
//По аналогичен начин процедираме и с играч 2.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] arr = new String[3][3];
        fillMatrix(arr);
        printMatrix(arr);
        GameCycle(scanner, arr);
    }
    private static void GameCycle(Scanner scanner, String[][] arr)
    {
        boolean isTr = false;
        for (; ; ) {
            if (isTr) {
                break;
            }
            isTr = player1(scanner, arr);
            if (isTr) {
                break;
            }
            isTr = player2(scanner, arr);
        }
    }

    private static boolean CheckForWinner(String[][] arr)
    {
        int x = 0;
        int o = 0;
        boolean isTr = false;
        for (int i = 0; i < 3; i++) {
            x = 0;
            o = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equalsIgnoreCase("X")) {
                    x++;
                }
                else if (arr[i][j].equalsIgnoreCase("O")) {
                    o++;
                }
                if (x == 3 || o == 3) {
                    System.out.println("Победа!");
                    isTr = true;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            x = 0;
            o = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[j][i].equalsIgnoreCase("X")) {
                    x++;
                }
                else if (arr[j][i].equalsIgnoreCase("O")) {
                    o++;
                }
                if (x == 3 || o == 3) {
                    System.out.println("Победа!");
                    isTr = true;
                }
            }
        }

        x = 0;
        o = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i][i].equalsIgnoreCase("X")) {
                x++;
            }
            else if (arr[i][i].equalsIgnoreCase("O")) {
                o++;
            }
            if (x == 3 || o == 3) {
                System.out.println("Победа!");
                isTr = true;
            }
        }

        x = 0;
        o = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i][2 - i].equalsIgnoreCase("X")) {
                x++;
            }
            else if (arr[i][2 - i].equalsIgnoreCase("O")) {
                o++;
            }
            if (x == 3 || o == 3) {
                System.out.println("Победа!");
                isTr = true;
            }
        }

        x = 0;
        o = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equalsIgnoreCase("X")) {
                    x++;
                }
                else if (arr[i][j].equalsIgnoreCase("O")) {
                    o++;
                }
            }
        }
        if (x + o == 9) {
            System.out.println("Равенство!");
            isTr = true;
        }
        return isTr;
    }

    private static boolean player2(Scanner scanner, String[][] arr)
    {
        for (; ; ) {
            System.out.print("Играч 2: ");
            int a = Integer.parseInt(scanner.nextLine());
            boolean isTrue = false;
            for (int i = 0; i < 3; i++) {
                if (isTrue) {
                    break;
                }
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j].equalsIgnoreCase(String.valueOf(a))) {
                        arr[i][j] = "O";
                        isTrue = true;
                        break;
                    }
                }
            }
            if (isTrue) {
                break;
            }
        }
        printMatrix(arr);
        return CheckForWinner(arr);
    }

    private static boolean player1(Scanner scanner, String[][] arr)
    {
        for (; ; ) {
            System.out.print("Играч 1: ");
            int a = Integer.parseInt(scanner.nextLine());
            boolean isTrue = false;
            for (int i = 0; i < 3; i++) {
                if (isTrue) {
                    break;
                }
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j].equalsIgnoreCase(String.valueOf(a))) {
                        arr[i][j] = "X";
                        isTrue = true;
                        break;
                    }
                }
            }
            if (isTrue) {
                break;
            }
        }
        printMatrix(arr);
        return CheckForWinner(arr);
    }

    private static void printMatrix(String[][] arr)
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] arr)
    {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                counter++;
                arr[i][j] = String.valueOf(counter);

            }
        }
    }
}
