package homeWork_3.task_4_Animal;

public class Cat extends Animal implements Pet{
    public String name;

    public Cat(int legs, String name) {
        super(legs=4);
        this.name = name;
    }

    public Cat(int legs) {
        super(legs=4);
    }

    @Override
    public void eat() {

        System.out.println("I eat cheese and mice");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {

        System.out.println("I like playing with wool balls");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "legs=" + legs +
                ", name='" + name + '\'' +
                '}';
    }
}
