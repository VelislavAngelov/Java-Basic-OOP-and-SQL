package homeWork_4.task_1_Cars;

public class Sedan extends Car {

    private double length;

    public Sedan() {
    }

    public Sedan(double speed, double regularPrice, String color, double length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void getSalePrice() {

        if (length > 6.5) {

            super.setRegularPrice(getRegularPrice() * 0.95);
        } else {
            super.setRegularPrice(getRegularPrice() * 0.90);
        }
    }
}
