package homeWork_3.task_4_Animal;

public class Fish extends Animal implements Pet{
    public String name;
    public Fish(int legs) {
        super(legs=0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

        this.name=name;
    }


    public void play() {

        System.out.println("I am play in water");
    }

    @Override
    public void eat() {

        System.out.println("I eat fish food");
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk and have no legs.");
    }
}
