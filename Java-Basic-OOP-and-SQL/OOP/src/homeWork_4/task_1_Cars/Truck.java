package homeWork_4.task_1_Cars;

public class Truck extends Car {
    private double weight;

    public Truck() {
    }

    public Truck(double speed, double regularPrice, String color, double weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void getSalePrice() {
        if (weight > 2000) {
            super.setRegularPrice(getRegularPrice() * 0.90);
        } else {
            super.setRegularPrice(getRegularPrice() * 0.80);
        }
    }

}


