package task_16_Collection.ReversSorted;

public class Square extends Rectangle {
    public Square(double width) {
        super(width);
    }

    @Override
    public double getArea() {
        return getWidth()+getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4*getWidth();
    }
}
