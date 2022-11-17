package task_8_MathematicalOperations;

public class Distance {

    //Напишете програма, която изчислява разстоянието от точка (x,y) до (0,0) по формулата:

    public static void main(String[] args) {

        double x = 8.3;
        double y = 14.5;

        double d = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println(d);

    }
}
