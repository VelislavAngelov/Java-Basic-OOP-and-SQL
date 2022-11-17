package taskAnimal_23_07_2022;

public class Test {
    public static void main(String[] args) {

        Bird penguin=new Penguin();
        System.out.println("Penguin:");
        penguin.sing();
        penguin.eat();
        ((Penguin)penguin).swim();

        System.out.println();
        System.out.println("Eagle:");
        Bird eagle = new Eagle();
        eagle.eat();
        eagle.sing();
        ((Eagle)eagle).fly();

        System.out.println();
        System.out.println("Carp:");
        Fish carp = new Carp();
        carp.typeWater();
        carp.eat();
        ((Carp)carp).swim();

        System.out.println();
        System.out.println("Shark:");
        Fish shark = new Shark();
        shark.eat();
        shark.typeWater();
        ((Shark)shark).swim();

        System.out.println();
        System.out.println("Cat:");
        Mammal cat = new Cat();
        cat.speak();
        cat.walk();
        cat.eat();

        System.out.println();
        System.out.println("Dog:");
        Mammal dog = new Dog();
        dog.eat();
        dog.walk();
        dog.speak();

    }
}
