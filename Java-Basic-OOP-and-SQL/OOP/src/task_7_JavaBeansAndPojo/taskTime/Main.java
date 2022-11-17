package task_7_JavaBeansAndPojo.taskTime;

public class Main {

    public static void main(String[] args) {

        Time time = new Time();
        time.setHour(5);
        time.setMinute(58);
        time.setSecond(58);
        time.print();
       // System.out.println();
        for (int i = 0; i < 66; i++) {

           time.tick();
           time.print();
          // System.out.println();
        }
    }
}
