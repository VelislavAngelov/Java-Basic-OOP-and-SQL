package task_20_MultidimensionalArrays;

import java.util.Scanner;

public class TheMatrix {

//Направете програма, която:
//Очаква потребителят да въведе редове (<10).
// Докато потребителят не въведе коректен ред,
// програмата продължава да го пита за броя на редовете. Използвайте подканващ стринг "Брой редове: "
//Очаква потребителят да въведе колони (<10).
// Докато потребителят не въведе коректна колона,
// програмата продължава да го пита за броя на колоните. Използвайте подканващ стринг "Брой колони: "
//Иска от него да въведе двете матрици, които са съставени от цели числа.
// Използвайте същите подканващи низове като в дадения пример.
//След това тя трябва да отпечата:
//Двете матрици една до друга. Отделете двете матрици с низа " | "
//стринга “Сумата на матриците е:” на отделен ред
//Сборът им (поелементарна сума)
//стрингът “Директната сумата на матриците е:” на отделен ред
//Сборът им (пряка/директна сума)
//Като отпечатвате елементите на матрицата, нека те заемат 4 символа и да са подравнение наляво.
//За помощ използвайте wikipedia или MathIsFun
//Наблегнете на валидирането на входните данни при въвеждане размера на матрицата.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Брой редове: ");
        int row = Integer.parseInt(scanner.nextLine());
        while (row > 10 || row < 1) {
            System.out.print("Брой редове: ");
            row = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Брой колони: ");
        int col = Integer.parseInt(scanner.nextLine());
        while (col > 10 || col < 1) {
            System.out.print("Брой колони: ");
            col = Integer.parseInt(scanner.nextLine());
        }

        int[][] firstMatrix = new int[col][row];
        int[][] secondMatrix = new int[col][row];

        System.out.println("Въведете матрица 1:");
        createMatrix(row, col, scanner, firstMatrix);
        System.out.println("Въведете матрица 2:");
        createMatrix(row, col, scanner, secondMatrix);
        printMatrix(row,col,firstMatrix,secondMatrix);
        System.out.println("Сумата на матриците е:");
        sumMatrix(firstMatrix,secondMatrix);
        System.out.println("Директната сумата на матриците е:");
        directSumMatrix(row, col, firstMatrix, secondMatrix);


    }

    private static void directSumMatrix(int row, int col, int[][] firstMatrix, int[][] secondMatrix) {
        int[][] nullMatrix = new int[row][col];
        for (int i = 0; i < nullMatrix.length; i++) {
            for (int j = 0; j < nullMatrix[i].length; j++) {
                nullMatrix[i][j] = 0;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", firstMatrix[i][j]);
            }
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", nullMatrix[i][j]);
            }
            System.out.println();

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", nullMatrix[i][j]);
            }
            for (int j = 0; j < col; j++) {
                System.out.printf("%-4d", secondMatrix[i][j]);
            }
            System.out.println();

        }
    }

    private static void printMatrix(int row,int col,int[][] firstMatrix,int[][]secondMatrix) {
        for (int i = 0; i < firstMatrix.length ; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.printf("%-4d", firstMatrix[i][j]);
            }
            System.out.print(" | ");
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.printf("%-4d", secondMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void createMatrix(int row, int col, Scanner scanner, int[][] matrix) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Ред " + i + ", Колона " + j + " = ");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());

            }
        }
    }
    private static void sumMatrix(int[][] first, int[][] second) {
        int row = first.length;
        int column = first[0].length;
        int[][] sum = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = first[i][j] + second[i][j];
                System.out.printf("%-4d",sum[i][j]);
            }
            System.out.println();
        }

    }
}
