package task_20_MultidimensionalArrays;

public class PascalTriangle {

//В лекцията имаше пример за така нареченият тригълник на Паскал. Допълнете програмата,
// така че да разпечата този триъгълник на екрана.
//Нека n = 5, a елементите на тригълника да са отделени от 1 празен символ.
// Вижте примера долу, който е за 3 елемента.

    public static void main(String[] args) {

        int n = 5;
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            // създаване на елементите на реда
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();

        }
    }
}