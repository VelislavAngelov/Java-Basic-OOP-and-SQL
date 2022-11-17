package homeWork_2.task_3_Animals;

import java.util.Scanner;

public class Test {
    //1.В задачата Animals от миналия път добавете класове Parrot, Pigeon, Seagull които наследяват Bird.
    // 2. Променете както следва имплементацията на методa sing() във всеки един от наследните на Bird.
    //Parrot -> I am singing "How are you"
    //Pigeon -> I am singing "Gu Gu Gu"
    //Seagull -> I am singing "Kra Kra Kra"
    //3. Добавете и клас Mammal които има два child класа Cat и Dog.
    //Cat има метод meow(), а Dog - bark()
    //Създайте клас Petshop който има метод printCatalogue.
    // Използвайте метод overloading за да направите две различни имплементации на printCatalogue.
    //4.1. printCatalogue() - извежда номерирано всички животни за които програмата знае
    // 1. Birds:
    // 	1.1. Pigeon
    // 	1.2. Parrot
    // 	1.3. Seagull
    //Mammal:
    //2.1. Dog
    //2.2. Cat
    //4.2. printCatalogue(AnimalType type) - извежда номериран каталог само за дадения тип (Mammal or Bird)
    //Сега потребителят трябва да си избере животно въвеждайки неговия номер.
    // В зависимост от типа животно то може да пее, лае или прави мяу.
    // Изведете в конзолота резултата от извикването на sing(), bark() или meow() методите за избраното животно.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Mammal mammal = new Mammal();
        Mammal mammal1 = new Dog();
        Mammal mammal2 = new Cat();


        Bird bird = new Bird();
        Bird bird1 = new Pigeon();
        Bird bird2 = new Parrot();
        Bird bird3 = new Seagull();

        Petshop petshop = new Petshop();

        System.out.println("Въведи животни 1. Птици,2. Бозаиници");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 1 -> {
                petshop.printCatalogue(bird);
                System.out.println("Избери птица: 1,2 или 3");
                int numB = Integer.parseInt(scanner.nextLine());
                switch (numB) {
                    case 1 -> bird1.Sing();
                    case 2 -> bird2.Sing();
                    case 3 -> bird3.Sing();
                }
            }
            case 2 -> {
                petshop.printCatalogue(mammal);
                System.out.println("Избери бозайник: 1 или 2");
                int numM = Integer.parseInt(scanner.nextLine());
                switch (numM) {
                    case 1 -> mammal1.bark();
                    case 2 -> mammal2.meow();
                }
            }
        }

    }
}
