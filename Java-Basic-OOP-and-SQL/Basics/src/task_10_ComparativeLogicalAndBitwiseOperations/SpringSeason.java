package task_10_ComparativeLogicalAndBitwiseOperations;

public class SpringSeason {
    //Напишете програма, в която дефинирате 2 int променливи - month & day.
    //Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително) и 20-ти юни (включително) и false,
    // в противен случай.
    //Нека:
    //month = 5
    //day = 1
    // Проверихте ли внимателно какви са ви входните данни? Ами ако въведа ден 31 на месец,
    // който няма 31 дни? Или пък въведа дата 40-ти май?

    public static void main(String[] args) {

        int month = 5;
        int day = 20;
        String result = (month >= 3 && month <=6) && (day>=1 && day <=20) ? "true" : "false";

        System.out.println(result);
    }

}
