package lectureTask_12_06_2022;

import java.util.*;

public class HangmanGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("words", "program", "java", "arrays", "methods"));
        List<Character> playerGuesses = new ArrayList<>();

        Random random = new Random();
        String word = wordsList.get(random.nextInt(wordsList.size()));
        // String word = scanner.nextLine();
        // System.out.println("Please enter a word:")
        System.out.println(word);

        int wrongCount = 8;
        while (true) {

            printWordState(word, playerGuesses);
            if (!getPlayerGuess(scanner, word, playerGuesses)) {
                wrongCount--;
            }
            if (getLose(wrongCount)) {
                break;
            }
            drawHangman(wrongCount);
            if (printWordState(word, playerGuesses)) {
                System.out.println("You win!");
                break;
            }
            System.out.println("Please enter your guess for the word!");
            if (scanner.nextLine().equals(word)) {
                System.out.println("You win!");
                break;
            } else {
                System.out.println("Nope! Try again.");
            }
        }

    }

    private static boolean getPlayerGuess(Scanner scanner, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter:");
        String letterGuess = scanner.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
        return word.contains(letterGuess);

    }

    private static boolean printWordState(String word, List<Character> playerGuesses) {

        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {

            if (playerGuesses.contains(word.charAt(i))) {

                System.out.print(word.charAt(i));
                correctCount++;
            } else {

                System.out.print("-");
            }
        }
        System.out.println();
        return (word.length() == correctCount);
    }

    public static void drawHangman(int wrongCount) {
        if (wrongCount == 7) {
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (wrongCount == 6) {
            System.out.println("|----------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (wrongCount == 5) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (wrongCount == 4) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (wrongCount == 3) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (wrongCount == 2) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else if (wrongCount == 1) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }

    }

    private static boolean getLose(int wrongCount) {
        if (wrongCount == 0) {
            System.out.println("You lose!");
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   / \\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            return true;
        }
        return false;
    }

}
