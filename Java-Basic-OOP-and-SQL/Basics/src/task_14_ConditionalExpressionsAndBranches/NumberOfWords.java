package task_14_ConditionalExpressionsAndBranches;

import java.util.Scanner;

public class NumberOfWords {

    //Да се отпечата “с думи” броя на думите във въведеното изречение на български език.
    //
    //Използване на String.split().length за да определите броят на думите.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        int words = sentence.split(" ").length;

        switch (words){
            case 1:
                System.out.println("едно");
                break;
            case 2:
                System.out.println("две");
                break;
            case 3:
                System.out.println("три");
                break;
            case 4:
                System.out.println("четри");
                break;
            case 5:
                System.out.println("пет");
                break;
            case 6:
                System.out.println("шест");
                break;
            case 7:
                System.out.println("седем");
                break;
            case 8:
                System.out.println("осем");
                break;
            case 9:
                System.out.println("девет");
                break;
            default:
                System.out.println("твърде дълго изречение");
                break;

        }
    }
}
