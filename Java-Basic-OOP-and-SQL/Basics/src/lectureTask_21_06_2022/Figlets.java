package lectureTask_21_06_2022;

import java.util.Scanner;

public class Figlets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        String[][]arr = new String[word.length()][];

        getLetter(word, arr);
        printLetter(arr);


    }

    private static void printLetter(String[][] arr) {
        for (String[]x: arr){

            for (String s:x){

                System.out.println(s);
            }
            System.out.println();
        }
    }

    private static void getLetter(String word, String[][] arr) {
        char letter;
        int index=0;
        for (int i = 0; i < word.length(); i++) {


            letter = word.charAt(i);

            switch (letter) {
                case 'a' -> index = 0;
                case 'b' -> index = 1;
                case 'c' -> index = 2;
                case 'd' -> index = 3;
                case 'e' -> index = 4;
                case 'f' -> index = 5;
                case 'g' -> index = 6;
                case 'h' -> index = 7;
                case 'i' -> index = 8;
                case 'j' -> index = 9;
                case 'k' -> index = 10;
                case 'l' -> index = 11;
                case 'm' -> index = 12;
                case 'n' -> index = 13;
                case 'o' -> index = 14;
                case 'p' -> index = 15;
                case 'q' -> index = 16;
                case 'r' -> index = 17;
                case 's' -> index = 18;
                case 't' -> index = 19;
                case 'u' -> index = 20;
                case 'v' -> index = 21;
                case 'w' -> index = 22;
                case 'x' -> index = 23;
                case 'y' -> index = 24;
                case 'z' -> index = 25;
            }
            arr[i] = Banner3.FONT[index];
        }
    }

}
