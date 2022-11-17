package homeWork_3.task_1_Calculator;

public class Calculator implements AdvancedArithmetic {
    @Override
    public double divisorSum(double[]num,double n) {
        double sum=0;
        for (double v : num) {
            if (v % n == 0) {
                sum += v;
            }
        }

        return sum;
    }
}
