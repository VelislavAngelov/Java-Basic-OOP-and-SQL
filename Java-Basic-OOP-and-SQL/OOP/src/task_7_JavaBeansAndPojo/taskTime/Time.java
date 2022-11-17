package task_7_JavaBeansAndPojo.taskTime;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {

    }

    public Time(int i, int i1, int i2) {
    }

    public void setHour(int hour) {
        if(hour <= 23){
            this.hour = hour;
        }
        else {
           // this.hour = 0;
        }

    }

    public void setMinute(int minute) {
        if(minute <= 59){
            this.minute = minute;
        }
        else {
           // this.minute = 0;
        }

    }

    public void setSecond(int second) {
        if(second <= 59){
            this.second = second;
        }
        else {
           // this.second = 0;
        }
    }
    public void tick(){

        this.second++;
        if(second>59){
            second=0;
            minute++;
        }
        if(minute>59){
            minute=0;
            hour++;
        }
        if(hour>23){
            hour=0;
        }
    }
    public  void print(){

        System.out.printf("Time is: %02d : %02d : %02d\n",hour,minute,second);

    }
}
