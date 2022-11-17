package task_15_Cycles;

import java.util.Scanner;

//Направете програма, която прочита дума от конзолата и проверява дали е палиндром.
//Игнорирайте малки-големи букви.
//Ако думата е палиндром, да отпечата true, в противен случай false.
//Палиндром е дума, която се чете еднакво отпред и отзад. Например следните думи са палиндроми: mom, radar, nikokin
//Тази задача е една от най-често срещаните при технически интервюта.

public class Palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String word= scanner.nextLine().toUpperCase();
        sb.append(word);
        sb.reverse();
        String newWord= sb.toString();

        if(word.equals(newWord)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
