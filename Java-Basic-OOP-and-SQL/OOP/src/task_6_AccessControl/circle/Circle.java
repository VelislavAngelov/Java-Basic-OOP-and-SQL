package task_6_AccessControl.circle;

public class Circle {


    private double radius ;
    private Color color;

    public Circle() {
    }

    public Circle(double radius) {
        setRadius(radius);
        this.color = Color.син;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea(){

        return Math.PI*radius*radius;
    }
    public  double getPerimeter(){

        return 2*Math.PI*radius;
    }
    public void makeMeMoon(){

        setColor(Color.жълт);
    }

    @Override
    public String toString() {
        return "Кръг с радиус "+getRadius()+" и диаметър "+getRadius()*2 +"\n"+
                "Периметър: "+getPerimeter() +"\n"+
                "Лице: "+getArea()+"\n"+
                "Цвят: "+getColor();
    }
}