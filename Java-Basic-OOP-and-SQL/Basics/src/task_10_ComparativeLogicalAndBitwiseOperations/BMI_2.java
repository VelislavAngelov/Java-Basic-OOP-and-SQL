package task_10_ComparativeLogicalAndBitwiseOperations;

public class BMI_2 {
    //Направете програма BMI, с която да изчислите моя Body Mass Index.
    //
    //Аз тежа 80кг и съм висок 171см.
    //
    // Ако съм съм надвишил малко теглото и съм Overweight напишете на екрана more training, less eating,
    // ако не съм - напишете you rock!

    public static void main(String[] args) {

        double hеight = 1.71;
        double weight = 80;
        double BMI = weight / (Math.pow(hеight,2));
        String result = BMI >= 25 ? "more training, less eating" : "you rock!";

        System.out.println(result);
    }

}
