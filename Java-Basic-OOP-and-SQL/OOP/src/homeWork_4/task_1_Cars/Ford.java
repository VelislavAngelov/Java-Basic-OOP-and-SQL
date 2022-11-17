package homeWork_4.task_1_Cars;

public class Ford extends Car {
    public int year;
    private double manufacturerDiscount;

    public Ford() {
    }

    public Ford(double speed, double regularPrice, String color, int year, double manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(double manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public void getSalePrice() {

        super.setRegularPrice(super.getRegularPrice() - manufacturerDiscount);
    }
}
