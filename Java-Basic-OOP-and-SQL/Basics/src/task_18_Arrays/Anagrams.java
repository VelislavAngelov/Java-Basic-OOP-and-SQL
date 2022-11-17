package task_18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

//Направeте програма, която прочита две думи от конзолата и отпечатва true, ако те са анаграми и false,
// ако не са. Абстрахирайте се от големината на буквите.
//Анаграми са Java и Vaaj например. И двата стринга са съставени от едни и същи букви, които са в разбъркан ред.
//Подсказка: String.toCharArray() методът ще ви помогне да конвертирате стринга в масив от char елементи.
// За да може да сравните дали са еднакви, ще се наложи да ги подредите по един и същ ред.
//Не забравяйте един от най-добрите приятели на програмиста - не кучето, а класът Arrays.
// Той може да ви е от изключителна полза.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(isAnagrams(word1,word2));
    }
    public static boolean isAnagrams(String word1,String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
