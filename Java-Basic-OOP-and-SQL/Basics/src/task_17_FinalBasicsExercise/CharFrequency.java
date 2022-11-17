package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class CharFrequency {

//Направете програма, която очаква от потребителяt да въведе:
//
//Изречение
//Символ
//Нека вашата програма изчисли колко пъти въведения символ се среща в изреченито и да го отпечата на екрана.
//
//Метода str.charAt(i) връща символа от даденият стринг на позиция i.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        String symbol = scanner.nextLine();
        char chr = symbol.charAt(0);
        int count = 0;

        for (int i = 0; i <words.length(); i++) {


            if(words.charAt(i) == chr){

                count++;
            }

        }
        System.out.println(count);
    }
}
