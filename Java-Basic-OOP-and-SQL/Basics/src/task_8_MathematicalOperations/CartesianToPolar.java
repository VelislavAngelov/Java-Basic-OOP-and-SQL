package task_8_MathematicalOperations;

public class CartesianToPolar {

    //Напишете програма, която дефинира 2 double координати x и y и изчислява съответните им r и theta поларни координати,
    // по следните формули:


    public static void main(String[] args) {

        double x = 3;
        double y = 4;

        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double theta = Math.atan2(y,x);

        System.out.println("r     = " + r);
        System.out.println("theta = " + theta);

    }
}
