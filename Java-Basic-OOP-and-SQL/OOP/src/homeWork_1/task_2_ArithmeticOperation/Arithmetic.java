package homeWork_1.task_2_ArithmeticOperation;

import java.util.Scanner;

public class Arithmetic {

    Scanner scanner = new Scanner(System.in);
    public int Add(int num1,int num2){

        return num1+num2;
    }
    public int Add(int n){
        int num=0;
        for (int i = 0; i < n; i++) {

            System.out.println("Get number:");
            int number=Integer.parseInt(scanner.nextLine());
            num+=number;
        }
        return num;
    }

}
