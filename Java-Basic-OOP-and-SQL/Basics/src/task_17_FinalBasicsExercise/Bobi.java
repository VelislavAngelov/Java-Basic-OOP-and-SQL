package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class Bobi {

//Боби е тийнейджър и има “изобилен” речник:
//
//Ако го попиташ нещо, отговаря с “Добре.”
//Ако му се развикаш (Нетикет: ТОВА Е ВИКАНЕ - т.е. ако сме написали всичко с главни букви, значи му викаме),
// той отговаря със “Споко бе, ман!”
//Ако му извикаш въпрос, следва “Спокоооо, знам к’во правя!”
//Ако просто го посочиш или го гледаш лошо, без да му говориш, той отговаря с “Хубаво деее”
//На всичко останало, което му говориш, той кима мъдро и продумва тихо “Ахъ.”.
//Направете програма, в която потребителят може да “говори” с Боби,
// въвеждайки изречение от конзолата в безкраен цикъл. В зависимост от въведеното изречение,
// програмата трябва да отпечата отговора на Боби.
//
//Ако въведете точка програмата спира изпълнението си.
//
//Ето примерен разговор:
//
//Здрасти!
//
//Ахъ.
//
//Какво е това Ахъ?
//
//Добре.
//
//ЧУ ЛИ МЕ?
//
//Спокоооо, знам к’во правя!
//
//ТИ НЕ СИ ДОБРЕ!
//
//Споко бе, ман!
//
//Хубаво де

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (true) {

            if (input.equals(".")) {
                break;
            }

            boolean empty = input.trim().isEmpty();
            boolean isUpper = input.equals(input.toUpperCase()) && (!empty);
            int question = input.lastIndexOf("?", input.length() - 1);
            boolean questionTrue = question != (-1);


            if (isUpper && questionTrue) {

                System.out.println("Спокоооо, знам к'во правя!");

            } else if (isUpper && questionTrue != true) {

                System.out.println("Споко бе, ман!");

            } else if (questionTrue) {

                System.out.println("Добре.");

            } else if (empty) {

                System.out.println("Хубаво деее");

            } else {

                System.out.println("Ахъ.");
            }
            if(scanner.hasNextLine()) {
                input = scanner.nextLine();
            }

        }

    }
}
