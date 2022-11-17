package homeWork_2.task_3_Animals;

import java.util.ArrayList;

public class Petshop {

    public void printCatalogue(Bird bird) {
        ArrayList<Bird> birds = new ArrayList<>();
        Bird bird1 = new Pigeon();
        Bird bird2 = new Parrot();
        Bird bird3 = new Seagull();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        int count = 0;
        for (Bird bird4 : birds) {
            ++count;
            System.out.printf("1.%d. %s \n", count, bird4);
        }
    }

    public void printCatalogue(Mammal mammal) {
        ArrayList<Mammal> mammals = new ArrayList<>();
        Mammal mammal1 = new Dog();
        Mammal mammal2 = new Cat();
        mammals.add(mammal1);
        mammals.add(mammal2);
        int count = 0;
        for (Mammal mammal3 : mammals) {
            count++;
            System.out.printf("2.%d. %s \n", count, mammal3);
        }
    }
}
