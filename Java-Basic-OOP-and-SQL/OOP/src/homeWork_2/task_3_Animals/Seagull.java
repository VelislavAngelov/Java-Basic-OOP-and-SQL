package homeWork_2.task_3_Animals;

public class Seagull extends  Bird{

    @Override
    public void Sing() {
        System.out.println("Seagull -> I am singing \"Kra Kra Kra\"");
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
        return "Seagull";
    }
}
