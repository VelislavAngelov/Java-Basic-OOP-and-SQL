package task_17_FinalBasicsExercise;

public class _99_Bottles {

//Използвайте цикъл, за да направите програма, която отпечатва текста на класиката:
//
//99 bottles of beer on the wall, 99 bottles of beer.
//Take one down and pass it around, 98 bottles of beer on the wall.
//…..
//2 bottles of beer on the wall, 2 bottles of beer.
//Take one down and pass it around, 1 bottle of beer on the wall.
//
//1 bottle of beer on the wall, 1 bottle of beer.
//Take it down and pass it around, no more bottles of beer on the wall.
//
//No more bottles of beer on the wall, no more bottles of beer.
//Go to the store and buy some more, 99 bottles of beer on the wall.
//Важно е между всеки стих да има празен ред!

    public static void main(String[] args) {


        for (int i = 99; i >= 0 ; i--) {

            if(i>2) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
                System.out.println();
            }
            else  if(i==2) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (i - 1) + " bottle of beer on the wall.");
                System.out.println();
            } else if(i==1) {

                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.");
                System.out.println();
            }else {
                System.out.print("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.");
            }


        }
    }
}
