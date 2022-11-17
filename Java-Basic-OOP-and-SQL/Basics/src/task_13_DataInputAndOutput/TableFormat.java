package task_13_DataInputAndOutput;

public class TableFormat {

    //Нека имате ученици със следните оценки:
    // Иванчо - 2, Марийка - 6, Пенчо - 4, Голям Петко - 5.
    // Използвайте printf да отпечатате оценките им в табличен вид, всеки ученик - на отделен ред.
    //
    //Нека дължината на колоната с имената е 20 символа, а колоната с оценките да е 2 символа.
    //
    //Имената са първи и са приравнени наляво. Втората колона с оценките е приравнена надясно.

    public static void main(String[] args) {

        String first = "Иванчо";
        String second = "Марийка";
        String third = "Пенчо";
        String fourth = "Голям Петко";

        int firstgrade = 2;
        int secondgrade = 6;
        int thirdgrade = 4;
        int fourthgrade = 5;

        System.out.printf("%-20s%2d%n",first,firstgrade);
        System.out.printf("%-20s%2d%n",second,secondgrade);
        System.out.printf("%-20s%2d%n",third,thirdgrade);
        System.out.printf("%-20s%2d%n",fourth,fourthgrade);
    }
}
