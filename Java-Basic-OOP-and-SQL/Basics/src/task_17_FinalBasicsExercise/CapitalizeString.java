package task_17_FinalBasicsExercise;

import java.util.Scanner;

public class CapitalizeString {

//Направете програма, която очаква потребителят да въведе едно цяло изречение.
//
//Нека вашата програма прочете изречението и след това, ако започва с малка буква
// да я смени на голяма. Нека добави точка, ако изречението не завършва със символ
// за край на изречението - точка, удивителна или въпросителна.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char charAt = str.charAt(0);
        char lastIndex = str.charAt(str.length() - 1);

        if (Character.isLowerCase(charAt)) {

            str = str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        if (lastIndex != '?' && lastIndex != '!' && lastIndex != '.') {

            str = str + ".";
        }
        System.out.println(str);

    }
}
