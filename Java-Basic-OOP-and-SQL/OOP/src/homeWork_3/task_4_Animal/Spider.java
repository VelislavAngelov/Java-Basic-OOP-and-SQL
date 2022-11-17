package homeWork_3.task_4_Animal;

public class Spider extends Animal{
    public Spider(int legs) {
        super(legs=8);

    }

    @Override
    public void eat() {

        System.out.println("I eat what I catch");
    }

    @Override
    public String toString() {
        return "Spider{" +
                "legs=" + legs +
                '}';
    }
}
