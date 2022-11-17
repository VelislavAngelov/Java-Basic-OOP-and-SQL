package taskAnimal_23_07_2022;

public class Shark extends Fish implements Swimmable{
    @Override
    public void swim() {

        System.out.println("I am swimming very fast");
    }

    @Override
    public void eat() {
        System.out.println("I eat fish");
    }

    @Override
    void typeWater() {

        System.out.println("I live in seawater");
    }
}
