package homeWork_4.task_2_GeometricObject;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {

        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {

        return 2 * (this.length + this.width);
    }
}
