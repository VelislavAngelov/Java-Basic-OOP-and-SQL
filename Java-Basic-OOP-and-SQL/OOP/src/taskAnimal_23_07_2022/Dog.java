package taskAnimal_23_07_2022;

public class Dog extends Mammal{
    @Override
    public void eat() {

        System.out.println("I like cat, but I eat dog food");
    }

    @Override
    public void speak() {
        System.out.println("Bau bau");
    }

    @Override
    public void walk() {

        System.out.println("I am walking");
    }
}
