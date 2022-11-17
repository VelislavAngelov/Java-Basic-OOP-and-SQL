package taskAnimal_23_07_2022;

public class Penguin extends  Bird implements Swimmable{
    @Override
    public void eat() {
        System.out.println("I eat fish");
    }


    @Override
    public void sing() {
        System.out.println("squeal squeal");
    }

    @Override
    public void swim() {
        System.out.println("I am a bird, but I can swim");
    }
}
