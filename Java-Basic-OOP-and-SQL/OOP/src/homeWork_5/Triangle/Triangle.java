package homeWork_5.Triangle;

public class Triangle {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private  double angle1;
    private  double angle2;
    private  double angle3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double angle1) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle1 = angle1;
    }

    public Triangle(double side1, double side2, double side3, double angle1, double angle2, double angle3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setAngle1(double angle1) {
        this.angle1 = angle1;
    }

    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }

    public void setAngle3(double angle3) {
        this.angle3 = angle3;
    }

    public double getArea() {
        return (side1 + side2 + side3) / 2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: " +"\n"+
                "side1: " + side1 +"\n"+
                "side2: " + side2 +"\n"+
                "side3: " + side3 +"\n"+
                "angle1: " + angle1 +"\n"+
                "angle2: " + angle2 +"\n"+
                "angle3: " + angle3 +"\n";
    }
}
