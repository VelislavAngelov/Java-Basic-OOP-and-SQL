package taskAnimal_23_07_2022;

public class Cat extends  Mammal{
    @Override
    public void eat() {

        System.out.println("I eat cheese and mice");
    }

    @Override
    public void speak() {
        System.out.println("meow meow");
    }

    @Override
    public void walk() {

        System.out.println("I am walking");
    }
}
