package task_22_SelfImprovementTasks;

import java.util.Scanner;

public class CowSay {

//Linux командата cowsay показва на екрана една крава и билборд, на който пише произволен текст:
//------------------------------
//| If you have Egyptian flu:  |
//| you're going to be a mummy |
//------------------------------
//                              \   ^__^
//                               \  (oo)\_______
//                                  (__)\       )\/\
//                                      ||----w |
//                                      ||     ||
//Напишете програма която имитира CowSay. Имайте предвид, че височината на билборда се мени в
// зависимост от размера на текста, но не и широчината!
//Направете метод say(String text).
//Стринга, който трябва да се отпечата се въвежда от клавиатурата.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text= scan.nextLine();
        int rows=text.length()/26+1;
        int counter =0;
        String line="------------------------------";

        String cow =
                "                              \\   ^__^\n" +
                        "                               \\  (oo)\\_______\n" +
                        "                                  (__)\\       )\\/\\\n" +
                        "                                      ||----w |\n" +
                        "                                      ||     ||";
        System.out.println(line);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 30; j++) {
                if(j==0||j==29){
                    System.out.print("|");
                }
                else if(j==1||j==28){
                    System.out.print(" ");
                }
                else{
                    if(text.length()>counter){
                        System.out.print(text.charAt(counter));
                    }
                    else{
                        System.out.print(" ");
                    }
                    counter++;
                }

            }
            System.out.println();
        }
        System.out.println(line);
        System.out.println(cow);
    }

}

//    Scanner scanner = new Scanner(System.in);
//    String input = scanner.nextLine();
//    System.out.println("-".repeat(30));
//    say(input);
//    System.out.println("------------------------------\n"
//                       + "                              \\   ^__^\n"
//                       + "                               \\  (oo)\\_______\n"
//                       + "                                  (__)\\       )\\/\\\n"
//                       + "                                      ||----w |\n"
//                       + "                                      ||     ||");
//  }
//
//  static void say(String text) {
//    int loop = text.length() / 26;
//
//    for (int i = 0; i < loop; i++) {
//      int start = i * 26;
//      String substring = text.substring(start, start + 26);
//      System.out.printf("| %-26s |\n", substring);
//    }
//
//    int end = text.length() % 26;
//    if (end > 0) {
//      String substring = text.substring(loop * 26);
//      System.out.printf("| %-26s |\n", substring);
//    }
//
