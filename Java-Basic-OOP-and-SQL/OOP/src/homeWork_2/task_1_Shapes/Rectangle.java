package homeWork_2.task_1_Shapes;

public class Rectangle extends Shapes{
    private double width;
    private double height;

    public Rectangle() {
    }

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

    public  double getMaxPossibleSquareInside(){
        double side=0;
        if(getHeight()>getWidth()){
            side=getWidth();
        }
        if(getWidth()>getHeight()){
            side=getHeight();
        }
        return side;
    }

}
