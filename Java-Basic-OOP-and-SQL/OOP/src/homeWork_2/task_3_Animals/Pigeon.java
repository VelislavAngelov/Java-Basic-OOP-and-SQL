package homeWork_2.task_3_Animals;

public class Pigeon extends Bird{

    @Override
    public void Sing() {
       System.out.println("Pigeon -> I am singing \"Gu Gu Gu\"");
    }

    @Override
    public void Walk() {
        super.Walk();
    }

    @Override
    public String toString() {
        return "Pigeon";
    }
}
