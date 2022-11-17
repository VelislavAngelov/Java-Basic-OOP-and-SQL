package task_18_Arrays;

import java.util.Scanner;

public class FindElementIndex {

//Нека имаме следният масив:
//int[] myArray = { 1, 4, 6, 2, 10, 5 };
//Напишете програма, която очаква потребителят да въведе число и след това намира на кой индекс се намира това число в дадения масив.
//Ако числото не е в масива, нека програмата отпечата -1.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] myArray = { 1, 4, 6, 2, 10, 5 };
        int num = Integer.parseInt(scanner.nextLine());
        boolean print = false;
        int index = 0;

        for (int i = 0; i < myArray.length; i++) {

             if(myArray[i] == num){

                  index=i;
                  print=true;
                  break;
             }

        }
        if(print){
            System.out.println(index);
        }
        else {
            System.out.println(-1);
        }
    }
}
