package task_15_Cycles;

import java.util.Scanner;

public class Vowels {
//Направете програма Vowels, която прочита изречение (на английски) от конзолата и отпечатва колко гласни има в него.
//Дължината на String можете да вземете чрез метода String.length(), например: "hello world".length().
// А за да вземете първият символ от стринга, ползвайте "hello world".charAt(

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        int count= 0;

        for (int i = 0; i <word.length() ; i++) {

            if(word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    ||word.charAt(i) == 'i' ||word.charAt(i) == 'o'
                    ||word.charAt(i) == 'u' ||word.charAt(i) == 'y'){
                count++;
            }

        }

        System.out.println(count);
    }
}
