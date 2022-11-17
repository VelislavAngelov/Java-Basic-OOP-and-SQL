package homeWork_2.task_1_Shapes;

public class Circle extends Shapes{

    private double radius ;

    public Circle() {
    }

    public Circle(double radius) {
        setRadius(radius);

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius==0){
            this.radius=1.0;
        }
        else {
            this.radius=radius;
        }
    }
    @Override
    public double getArea(){

        return Math.PI*radius*radius;
    }
    @Override
    public  double getPerimeter(){

        return 2*Math.PI*radius;
    }
    public double getDiameter(){

        return radius*2;
    }

}
