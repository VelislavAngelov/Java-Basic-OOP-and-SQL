package taskAnimal_23_07_2022;

public class Eagle extends Bird implements Flyable{

    @Override
    public void eat() {

        System.out.println("I'm an eat what I catch");
    }

    @Override
    public void fly() {

        System.out.println("I fly high and fast");
    }

    @Override
    public void sing() {
        System.out.println("I i i i i i.....");
    }
}
