package homeWork_2.task_3_Animals;

public class Parrot extends  Bird{

    @Override
    public void Sing() {
        System.out.println("Parrot -> I am singing \"How are you\"");
    }

    @Override
    public void Fly() {
        super.Fly();
    }

    @Override
    public void Walk() {
        super.Walk();
    }

    @Override
    public String toString() {
        return "Parrot";
    }
}
