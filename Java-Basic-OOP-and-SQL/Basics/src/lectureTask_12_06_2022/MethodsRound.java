package lectureTask_12_06_2022;

import java.util.Scanner;

public class MethodsRound {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        System.out.println(setRoundingMode(num));
        System.out.println(Math.round(num));
        System.out.println(Math.abs(num));
    }
    public static int setRoundingMode(double num){

        double dAbs = Math.abs(num);
        int i = (int) dAbs;
        double result = dAbs - (double) i;
        if(num<0){
            if(result<=0.50){
                return num<0 ? -i : i;
            }else{
                return num<0 ? -(i+1) : i+1;
            }
        }else {
            if (result < 0.5) {
                return num < 0 ? -i : i;
            } else {
                return num < 0 ? -(i + 1) : i + 1;
            }
        }

        // return num;
    }

}
