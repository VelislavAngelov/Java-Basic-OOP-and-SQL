package homeWork_2.task_3_Animals;

public class Bird extends Animal{


    public void Fly(){
        System.out.println("I am flying");
    }
    public void Sing(){
        System.out.println("I am singing");
    }

    @Override
    public void Walk() {
        super.Walk();
    }
}
