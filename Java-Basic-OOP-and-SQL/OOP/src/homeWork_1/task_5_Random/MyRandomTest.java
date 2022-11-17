package homeWork_1.task_5_Random;

public class MyRandomTest {

    //Дефинирайте наследник на клас наследник Random, който да има метод връщащ случайни числа от тип double в интервал double [а,b].
    // (Разгледайте какви методи вече са дефинирани и вижте кой е най-лесно да бъде модифициран, така, че да ви свърши работа;
    public static void main(String[] args) {

        MyRandom myRandom = new MyRandom();

        for (int i = 0; i < 10; i++) {

            System.out.println(myRandom.nextDouble(1.2, 99.2));
        }

    }
}
