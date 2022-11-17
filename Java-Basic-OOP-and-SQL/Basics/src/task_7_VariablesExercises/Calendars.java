package task_7_VariablesExercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Calendars {

//    Ваша приятелка е учителка в детска градина и организира изготвяне на календари с децата за Коледа.
//    Помолила ви е да създадете програма, която да улесни работата й.
//    Имат опция за избор от 4 вида календари, всеки от които на различна цена.
//    Помислете и дефинирайте какви променливи и от какъв тип ще имате в програмата.

    public static void main(String[] args) {

        int typeOfCalendar = 1;
        double priceOfCalendar = 3.99;


        //тук директно задаван стйности на масива
        int[] arr ={1,2,3};
        rotate(arr,2);

        //Тук създавам масив от 5 и след това добавям стойности на
        int[] arr1=new int[5];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;

        String[] authors = {
                "James Gosling",
                "Bill Joy",
                "Guy Steele"
        };


        System.out.println(Arrays.toString(authors));
        System.out.println();

        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println(Arrays.toString(arr1));
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {

            int num=arr1[i];
            System.out.println(num);
        }
        System.out.println();
        for (int num : arr) {

            System.out.println(num);
        }
        System.out.println();
        for (int i = 0; i < authors.length; i++) {

            String str=authors[i];
            System.out.println(str);
        }
       // System.out.println(Penguin(18, 18));


    }

    public static int Penguin(int penguin, int years) {
        int num = penguin;
        int counter = 0;
        while ((penguin % 2) == 0) {
            penguin /= 2;
        }
        if (penguin == 1) {
            counter++;
        } else {
            penguin = num;
        }

        while (true) {

            if (penguin % 2 == 0) {
                counter++;
                penguin = penguin / 2;

            }
            if (penguin % 2 != 0) {
                if (penguin == 7) {
                    counter += 6;
                }
                if (counter < years) {
                    counter++;
                    penguin = penguin * 3 + 1;

                }
            }
            if (years == counter) {
                break;
            }
        }

        return penguin;
    }


    private static void extracted(int n) {

        int pow = n;

        while (n > 1) {
            int sum = 1;

            while (true) {
                sum = sum * n;
                if (sum == pow) {
                    System.out.println(pow + " is a Power of " + n);
                    break;
                } else if (sum > pow) {
                    System.out.println(pow + " is not a Power of " + n);
                    break;
                }
            }
            n--;
        }
    }


    public static long power(int x, int y) {
        long result = x;
        for (int i = 1; i < y; i++) {
            result = result * x;
        }
        return result;
    }
    public static void rotate(int[] array, int amount) {

        for (int i = 0; i < amount; i++) {
            int lastDigit;
            lastDigit = array[array.length - 1];
            for (int j = 0; j < array.length - 1; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastDigit;
        }
    }
}



