package homeWork_2.task_3_Animals;

public class Cat extends Mammal{

    @Override
    public  void meow(){

        System.out.println("Meow meow");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
