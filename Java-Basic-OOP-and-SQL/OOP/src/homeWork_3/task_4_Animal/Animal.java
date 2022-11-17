package homeWork_3.task_4_Animal;

public abstract class Animal {

    public int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();
    public  void walk(){
        System.out.printf("I am walking by moving my %d legs.\n",legs);
    }
}
