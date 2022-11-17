package homeWork_1.task_1_Animals;

public class Main {
    //Даден е клас Animal с метод void walk(){ System.out.println(“I am walking”); }
    //Клас Bird който наследява Animal и има метод fly() със следното тяло System.out.println(“I am flying”);
    //Напишете клас Main.java - създава Bird, вика bird.walk(), bird.fly()
    //Добавете sing() метод в Bird класа т. че програмата да принтира следния изход: I am walking
    //I am flying
    //I am singing
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.Walk();
        bird.Fly();
        bird.Sing();
    }
}
