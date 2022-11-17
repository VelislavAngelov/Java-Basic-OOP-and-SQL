package lectureTask_09_06_2022;

public class TablesMuliplication {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 1) {
                System.out.println("\u001B[34m-".repeat(56));
                System.out.printf("\u001B[34m| *  | 1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 |  10 |\n");
            }
            System.out.println("\u001B[34m-".repeat(56));

            for (int j = 1; j <= 10; j++) {
                if (j == 1) {
                    System.out.printf("| %-3d", i);

                }
                System.out.print("\u001B[34m| ");
                System.out.printf("\u001B[33m%-3d", (j * i));
                if (j == 10) {
                    System.out.print("\u001B[34m|");
                }
            }
            System.out.println();

        }
        System.out.println("\u001B[34m-".repeat(56));
    }
}
