package task_10_ComparativeLogicalAndBitwiseOperations;

public class DivideBy17 {
    //Измислих си едно число - 8589935681. Чудя се дали се дели на 17.
    //
    //Напишете програма, която проверява дали числото се дели на 17. И ако е така - напишете на екрана yes,
    // в противен случай напишете no.
    //
    // Подсказка - изпозвайте операторите ‘остатък от делене’ и ternary оператор.

    public static void main(String[] args) {

        long num = 8589935681l;

        String result = (num % 17 == 0) ?"yes":"no";

        System.out.println(result);
    }

}
