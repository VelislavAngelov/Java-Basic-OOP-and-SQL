package homeWork_4.task_2_GeometricObject;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public void resize(int percent) {

        setRadius(getRadius()+percent);
    }
}
