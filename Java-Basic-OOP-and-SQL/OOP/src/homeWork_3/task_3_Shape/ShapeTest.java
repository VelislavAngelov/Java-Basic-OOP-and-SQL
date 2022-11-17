package homeWork_3.task_3_Shape;

public class ShapeTest {

    //Създайте абстрактен клас Shape с методи getArea() и getPerimeter().
    //Създайте класове Circle и Square които наследяват Shape и имплементират абстрактните му методи.
    //Създайте ShapeTest клас който инициализира един Circlе и един Square и извежда в конзолата техните лица и периметър.

    public static void main(String[] args) {

        Shape shape =new Circle(5);
        Shape shape1 =new Square(6);

        System.out.printf("Circle area: %f\n",shape.getArea());
        System.out.printf("Circle perimeter: %f\n",shape.getPerimeter());

        System.out.printf("Square area: %f\n",shape1.getArea());
        System.out.printf("Square perimeter: %f\n",shape1.getPerimeter());



    }
}
