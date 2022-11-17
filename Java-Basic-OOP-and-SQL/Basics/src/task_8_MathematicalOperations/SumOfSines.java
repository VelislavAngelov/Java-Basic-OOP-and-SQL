package task_8_MathematicalOperations;

public class SumOfSines {

    //Напишете програма SumOfSines, в която дефинирате променлива t (в градуси) и изчислява резултата от:

    public static void main(String[] args) {

        double t = 20;
        t = Math.toRadians(t);
        double d = Math.sin(2*t) + Math.sin(3*t);

        System.out.println(d);
    }
}
