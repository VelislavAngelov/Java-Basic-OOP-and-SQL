package task_7_JavaBeansAndPojo.company;

public class Cars {
    private String mark;
    private String model;
    private String number;

    public Cars() {
    }

    public Cars(String name, String model, String number) {
        this.mark = name;
        this.model = model;
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if(isNullOrEmpty(mark)){
            this.mark = mark;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(isNullOrEmpty(model)){
            this.model = model;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(isNullOrEmpty(number)){
            this.number = number;
        }
    }
    public void MovedInWork(){
        System.out.println("Go to work");

    }
    public  void MovedToHome(){
        System.out.println("Go home");
    }

    public static boolean isNullOrEmpty(String string) {

        return string != null && !string.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "Cars :" +"\n"+
                "mark: " + mark + '\n' +
                "model: " + model + '\n' +
                "number: " + number;
    }
}
