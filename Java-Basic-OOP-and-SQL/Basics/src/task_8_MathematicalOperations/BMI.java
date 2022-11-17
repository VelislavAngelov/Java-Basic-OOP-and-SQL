package task_8_MathematicalOperations;

public class BMI {
    //    Направете програма BMI, с която да изчислите моя Body Mass Index.
//
//    Аз тежа 80кг и съм висок 171см.
//
//    Отпечатайте моя BMI на екрана с помощта на System.out.println().
//
//    Има ли надежда за мен или съм твърде дебел?

    public static void main(String[] args) {

        double hеight = 1.71;
        double weight = 80;
        double BMI = 80 / (hеight * hеight);

        System.out.println(BMI);

    }
}
