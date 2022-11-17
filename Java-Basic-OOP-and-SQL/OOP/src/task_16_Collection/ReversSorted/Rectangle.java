package task_16_Collection.ReversSorted;

import java.util.Objects;

public class Rectangle extends Shape implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.height+this.width);
    }

    @Override
    public int compareTo(Rectangle o) {

        if(this.getArea()>o.getArea()){
            return 1;
        }
        else if(this.getArea()<o.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
//    @Override
//    public int compareTo(Rectangle o) {
//
//        if(this.getArea()>o.getArea()){
//            return -1;
//        }
//        else if(this.getArea()<o.getArea()) {
//            return 1;
//        }
//        return 0;
//    }
}
