package taskAnimal_23_07_2022;

public class Carp extends Fish implements Swimmable{

    @Override
    public void swim() {
        System.out.println("I am swimming very deep");
    }

    @Override
    public void eat() {
        System.out.println("I am an omnivore");
    }

    @Override
    void typeWater() {
        System.out.println("i live in freshwater");

    }
}
