package homeWork_3.task_1_Calculator;

public class TestCalculator {

    //Създайте интерфейс AdvancedArithmetic който има абстрактен метод divisorSum(n).
    //Създайте клас Calculator който имплементира AdvancedArithmetic т. че divisorSum(n) да връща сбора на всички числа които делят n.
    public static void main(String[] args) {

        double[] num={5,6,8,9,12,45,65,48,13};
        Calculator calculator=new Calculator();

        System.out.println(calculator.divisorSum(num,5));

    }
}
